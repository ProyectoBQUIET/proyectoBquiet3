window.onload = cargar

function iniciar(){
	//recuperamos el boton y le asignamos una funcion al evento onclick(cuando se pulsa el boton con el raton)
	var btCargar = document.getElementById("btCargar");
	btCargar.onclick = cargar; //cargar es la definicion, no es una llamada

	
}

function cargar(){
	// Data retrieved from http://vikjavev.no/ver/index.php?spenn=2d&sluttid=16.06.2015.
	var datos = document.getElementById("datos").innerHTML;
	var lmax = document.getElementById("lmax").innerHTML;
	var lmin = document.getElementById("lmin").innerHTML;
	var year = document.getElementById("year").innerHTML;
	var mes = document.getElementById("mes").innerHTML;
	var dia = document.getElementById("dia").innerHTML;
	var hora = document.getElementById("hora").innerHTML;
	var minuto = document.getElementById("minuto").innerHTML;
	
	
	var arrayy = new Array();
	
	arrayy = datos.split(",");
	
	for(var i=0; i<arrayy.length; i++){
		arrayy[i] = parseInt(arrayy[i]);
	}
	
	
	Highcharts.chart('container', {
		chart: {
			type: 'spline',
			zoomType: 'x'
				
        },
	    title: {
	        text: 'Registro acústico diario'
	    },
	    
	    xAxis: {
	        type: 'datetime',
	        labels: {
	            overflow: 'justify'
	        }
	    },
	    yAxis: {
	        title: {
	            text: 'sonido (db)'
	        },
	        minorGridLineWidth: 0,
	        gridLineWidth: 0,
	        alternateGridColor: null,
	        plotBands: [{ // Nivel bajo de sonido
	            from: 0.0,
	            to: lmin-1,
	            color: 'rgb(175, 255, 178)',
	            label: {
	                text: 'Nivel bajo de sonido',
	                style: {
	                    color: 'green'
	                }
	            }
	        },
	        { // Nivel normal de sonido
	            from: lmin,
	            to: lmax-1,
	            color: 'rgb(255, 255, 165)',
	            label: {
	                text: 'Nivel normal de sonido',
	                style: {
	                    color: 'rgb(214, 214, 0)'
	                }
	            }
	        },
	        { // Nivel alto de sonido
	            from: lmax,
	            to: 120.0,
	            color: 'rgb(255, 195, 188)',
	            label: {
	                text: 'Nivel alto de sonido',
	                style: {
	                    color: 'red'
	                }
	            }
	        }
	        
	        
	        
	        ]
	    },
	    tooltip: {
	        valueSuffix: ' db'
	    },
	    plotOptions: {
	        spline: {
	            lineWidth: 4,
	            states: {
	                hover: {
	                    lineWidth: 2
	                }
	            },
	            marker: {
	                enabled: false
	            },
	            pointInterval: 60000, // one minute
	            pointStart: Date.UTC(year, mes, dia, hora,minuto,0)
	        }
	    },
	    series: [{
	        name: 'valor',
	        color: 'rgb(135, 135, 97)',
	        data: arrayy

	    }],
	    navigation: {
	        menuItemStyle: {
	            fontSize: '10px'
	        }
	    }
	});
	
	var textarea = document.getElementById("json").value;
	//alert(textarea);

	var json = ""+textarea;
	//var json ='{"registros" : [{ "rango":"alto" , "value":70 },{ "rango":"medio" , "value":20 },{ "rango":"bajo" , "value":20 } ]}';
	
	//alert(json);
	var obj = JSON.parse(json);
	
	var array = new Array();
	array[0] = new Array("hora","db");
	

	
	for (var i=0; i<obj.registros.length; i++){
		array[i+1] = new Array(obj.registros[i].rango,obj.registros[i].value);
	}
	
	google.charts.load('current', {'packages':['corechart']});
	google.charts.setOnLoadCallback(drawChart);

	function drawChart() {

		var data = google.visualization.arrayToDataTable(array);

		var options = {
				title: 'Registro acústico diario',
				slices: {
		            0: { color: 'red' },
		            1: { color: 'yellow' },
		            2: { color: 'green' }
		          }, 
				backgroundColor: 'transparent'
		};

		var chart = new google.visualization.PieChart(document.getElementById('piechart'));

		chart.draw(data, options);
	}
	
	
}