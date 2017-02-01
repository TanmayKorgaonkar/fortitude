
function annualreturns(json){
	$(function(){
		var len = json.annualreturns.length
		i=0;
		var options={
				chart:{
					type:'column'
				},
				credits:{
					enabled:false
				},
				title:{
					text:'Investment Returns By Month'
				},
				subtitle:{
					text:'Source: Data',
					x:-20
				},
				yAxis:{
					min:0,
					title:{
						text:'Interest gained'
					}
				},
				plotOptions:{
					column:{
						pointPadding:0.2,
						borderWidth:0
					}
				},
				xAxis:{
					categories:[]
				},
				series:[]
		}
		for(i;i<len;i++){
			if(i === 0){
				var dat = json.annualreturns[i].category,
				lenj=dat.length,
				j=0,
				temmp;
				for(j;j<lenj;j++){
					options.xAxis.categories.push(dat[j]);
				}
			}else{
				options.series.push(json.annualreturns[i]);
			}
		}
		$('placeholder').highcharts(options);
	});
}

/*$(function () {
    var chart = new Highcharts.Chart({
        chart: {
            renderTo: 'container',
            type: 'column'
        },
        xAxis: {
            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
        },
        
        plotOptions: {
            series: {
                cursor: 'pointer',
                point: {
                    events: {
                        click: function() {
                            for (var i = 0; i < this.series.data.length; i++) {
                                this.series.data[i].update({ color: '#ECB631' }, true, false);
                            }
                            this.update({ color: '#f00' }, true, false)
                        }
                    }
                }
            }
        },
            
        series: [{
            data: [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4]        
        }]
    });
});
*/
function generateChart(){
	chartType="annualreturns";
	$("#placeholder").text("");
	$.ajax({
		type: "GET",
		url:"http://localhost:8086/FortitudeCard/fortitude/transactions?jsonp="+chartType,
		dataType : 'jsonp',
		jsonCallback: chartType,
		error : function(){
			alert("Error is occured in chart processing");
		}
		
	});
}