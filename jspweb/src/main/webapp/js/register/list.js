 var map = new kakao.maps.Map(document.getElementById('map'), { // 지도를 표시할 div
        center : new kakao.maps.LatLng(36.2683, 127.6358), // 지도의 중심좌표
        level : 12 // 지도의 확대 레벨
    });



var clusterer = new kakao.maps.MarkerClusterer({
        map: map, // 마커들을 클러스터로 관리하고 표시할 지도 객체
        averageCenter: true, // 클러스터에 포함된 마커들의 평균 위치를 클러스터 마커 위치로 설정
        minLevel: 10, // 클러스터 할 최소 지도 레벨
        disableClickZoom: true // 클러스터 마커를 클릭했을 때 지도가 확대되지 않도록 설정한다
});
 
 $.ajax({
      
            url : "/jspweb/ProductinfoController",   
            method : "get",   
            data : {type : "findByAll"},      
           success : jsonArray=>{console.log(jsonArray)
           
		           var markers = jsonArray.map((p) => {
					   
		            return new kakao.maps.Marker({
		                position : new kakao.maps.LatLng(p.plat, p.plng)
		            });
		        });  
           			  // 클러스터러에 마커들을 추가합니다
        			clusterer.addMarkers(markers);
           }    
                    
   })
 

// 마커 클러스터러에 클릭이벤트를 등록합니다
// 마커 클러스터러를 생성할 때 disableClickZoom을 true로 설정하지 않은 경우
// 이벤트 헨들러로 cluster 객체가 넘어오지 않을 수도 있습니다
kakao.maps.event.addListener(clusterer, 'clusterclick', function(cluster) {

 // 현재 지도 레벨에서 1레벨 확대한 레벨
 var level = map.getLevel()-1;

// 지도를 클릭된 클러스터의 마커의 위치를 기준으로 확대합니다
map.setLevel(level, {anchor: cluster.getCenter()});
});

/* 1. 현재 보고 있는 지도의 동서남북 좌표 얻기*/
getInfo();
function getInfo() {
    

    let 북 = map.getBounds().pa; console.log( "북:"+북 ) // 동
    let 남 = map.getBounds().qa; console.log( "남:"+남 )// 서
    let 서 = map.getBounds().ha; console.log( "서:"+서 )// 남 
    let 동 = map.getBounds().oa; console.log( "동:"+동 )// 북 
    
    findByLatLng(동 , 서 , 남 , 북); // 2번실행
 
}


// 2. 해당하는 동서남북 좌표에 범위내 제품만 출력하기
// 2. 현재카카오지도내 보고있는 동서남북 기준내 제품들을 출력 함수 
function findByLatLng( east , west  ,  south  , north  ) {
	clusterer.clear(); // * 클러스터내 모든 마커를 초기화
	$.ajax({
		url : "/jspweb/ProductinfoController" , method : "get" ,
		async : false , /* ajax 동기화설정 [비동기통신 async : true] / [동기통신 async : false] */
		data : { type : "findByLatLng"  , east : east , west : west , south : south , north : north },
		success : jsonArray => { console.log( jsonArray ); 
		
		
			// ------------------ 1. 마커를 생성해서 클러스터에 저장 ------------------------------- //
			var markers = jsonArray.map( (p) => {
		        return new kakao.maps.Marker({
		            position : new kakao.maps.LatLng( p.plat, p.plng )
		        });
		    });
			clusterer.addMarkers(markers); // 마커들을 클러스터 저장..
			
			
			// ------------------ 2. 사이드바에 제품 출력 ------------------------------------------ //
			let sidebar = document.querySelector('.sidebar');
			let html = ``;
				// 
				jsonArray.forEach( (p)=>{
					html += `<div class="card mb-3" style="max-width: 540px;">	
							  <div class="row g-0">	
							    <div class="col-md-5">
							    	<a href="/jspweb/Product/view.jsp?pno=${ p.pno }" >
							      		<img src="/jspweb/Product/img/${ Object.values(p.imgList)[0] }" class="img-fluid rounded-start" alt="...">
							    	</a>
							    </div>
							    <div class="col-md-7">
							      <div class="card-body">
							        <h5 class="card-title">${ p.pname }</h5>
							        <p class="card-text">
							        	<div> ${ p.pcontent } </div>
							        	<div> ${ p.pprice.toLocaleString() } 원 </div>
							        </p>
							      </div>
							    </div>
							  </div>
							</div>`
				});
			sidebar.innerHTML = html; 
		}
	})
} // f end 
// 3. 카카오지도에서 드래그를 하고 끝났을때. 1번함수 재실행 
kakao.maps.event.addListener(map, 'dragend', function() {  getInfo(); });