
window.onload = iniciar
 


function iniciar(){
	//recuperamos el boton y le asignamos una funcion al evento onclick(cuando se pulsa el boton con el raton)
	var btCargar = document.getElementById("btCargar");
	btCargar.onclick = cargar; //cargar es la definicion, no es una llamada

	
}



function cargar(){
		
	var json="";
	var xmlhttp =  new XMLHttpRequest();
	xmlhttp.onreadystatechange = function(){
		if(this.status==200 && this.readyState==4){ //si todo ha ido bien
			//volcamos la respuesta del servidor en el cuadro de texto
			var respuesta= this.responseText;
			respuesta = '{ "registros" : '+respuesta+'}';
			json =respuesta;
			alert(respuesta);
			
			json ='{ "registros" : [{"estado":"Alto","tiempo":10},{"estado":"Normal","tiempo":50},{"estado":"bajo","tiempo":5}]}';
			
			alert(json);
			var obj = JSON.parse(json);
		
			var array = new Array();
			array[0] = new Array("estado","tiempo");
			
			for (var i=0; i<obj.registros.length; i++){
				array[i+1] = new Array(obj.registros[i].estado,obj.registros[i].tiempo);
			}
			
			google.charts.load('current', {'packages':['corechart']});
		      google.charts.setOnLoadCallback(drawChart);

		      function drawChart() {

		        var data = google.visualization.arrayToDataTable(array);

		        var options = {
		          title: 'My Daily Activities'
		        };

		        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

		        chart.draw(data, options);
		      }
		}		
	};
	
	
	xmlhttp.open("GET","http://localhost:8080/bquiet/getjson",true); //el último true no es necesario, ya que por defecto, lo envia de forma asincrona
	xmlhttp.send();

	
	
	
	
	/*
	
	
	
	
	var json = '{ "registros" : [' +
	'{ "date":"9:00" , "value":60 },' +
	'{ "date":"10:00" , "value":80 },' +
	'{ "date":"11:00" , "value":80 },' +
	'{ "date":"12:00" , "value":60 },' +
	'{ "date":"13:00" , "value":30 },' +
	'{ "date":"14:00" , "value":30 },' +
	'{ "date":"15:00" , "value":60 },' +
	'{ "date":"16:00" , "value":80 },' +
	'{ "date":"17:00" , "value":80 },' +
	'{ "date":"18:00" , "value":30 },' +
	'{ "date":"19:00" , "value":30 },' +
	'{ "date":"20:00" , "value":80 },' +
	'{ "date":"21:00" , "value":80 },' +
	'{ "date":"22:00" , "value":60 },' +
	'{ "date":"23:00" , "value":80 } ]}';
	*/
	//json ='{ "registros" : [{ "date":"9:00" , "value":60 },{ "date":"22:00" , "value":60 },{ "date":"23:00" , "value":80 } ]}';
	
	//jsonvar json = "{'registros':[{'date':'1488963901','value':'60'},{'date':'1488963901','value':'80'}]}";
	

	/*
	
	var obj = JSON.parse(json);
	
	var array = new Array();
	array[0] = new Array("hora","db");
	

	
	for (var i=0; i<obj.registros.length; i++){
		array[i+1] = new Array(obj.registros[i].date,obj.registros[i].value);
	}
	
	
	*/
	/*
	google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart);

    function drawChart() {
      var data = google.visualization.arrayToDataTable(array);

      var options = {
        title: 'Company Performance',
        curveType: 'function',
        legend: { position: 'bottom' }
      };

      var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

      chart.draw(data, options);
    }*/
	
/*
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

     
      
      function drawChart() {
        var data = google.visualization.arrayToDataTable(array);

        var options = {
          title: 'The decline of \'The 39 Steps\'',
          vAxis: {title: 'Accumulated Rating'},
          isStacked: true
        };

        var chart = new google.visualization.SteppedAreaChart(document.getElementById('chart_div'));

        chart.draw(data, options);
      }
      
      
      */
      
	
	
}

