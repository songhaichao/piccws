$(function(){


});
function left(path){
  var id = $("#id").val();
  var phone = $("#phone").val();
  var name = $("#name").val();
  var chudan = $('#chudan').val();
  var pageNumber = $("#pageNumber").val();
  var pageSize = $("#pageSize").val();
  
  var gopageNumber =pageNumber*1-1; 
  if(pageNumber>=2){
  	$("#pageNumber").val(gopageNumber);
  	  $.post(path+"user2.jsp",{"pageNumber":gopageNumber,"id":id,"phone":phone,"name":name,"chudan":chudan},function(result){
    $("#content").html(result);
    $("#currentPageNumber").html(gopageNumber);
  });
  }else{
  alert("已经是第一页了");
  }
}
function right(path){
  var id = $("#id").val();
  var phone = $("#phone").val();
  var name = $("#name").val();
  var chudan = $('#chudan').val();
  var pageNumber = $("#pageNumber").val();
  var pageSize = $("#pageSize").val();
  
  var gopageNumber =pageNumber*1+1; 
  if(pageNumber<pageSize){
  	$("#pageNumber").val(gopageNumber);
  	  $.post(path+"user2.jsp",{"pageNumber":gopageNumber,"id":id,"phone":phone,"name":name,"chudan":chudan},function(result){
    $("#content").html(result);
    $("#currentPageNumber").html(gopageNumber);
  });
  }else{
  alert("已经是最后一页了");
  	
  }
}
function query(path){
  var id = $("#id").val();
  var phone = $("#phone").val();
  var name = $("#name").val();
  var chudan = $('#chudan').val();
   $.post(path+"user3.jsp",{"id":id,"phone":phone,"name":name,"chudan":chudan},function(result){
   	var count = result;
   	var pageSize = Math.ceil(count/10);
    $("#pagSize").html(pageSize);
    $("#count").html(count);
  });
  	  $.post(path+"user2.jsp",{"pageNumber":"1","id":id,"phone":phone,"name":name,"chudan":chudan},function(result){
    $("#content").html(result);
    $("#currentPageNumber").html(1);
  });
}
function go(path){
  var id = $("#id").val();
  var phone = $("#phone").val();
  var name = $("#name").val();
  var chudan = $('#chudan').val();
  var page = $("#page").val();
  var pageSize = $("#pageSize").val();
  if(page>0&&page<=pageSize){
  	$("#pageNumber").val(page);
  	  $.post(path+"user2.jsp",{"pageNumber":page,"id":id,"phone":phone,"name":name,"chudan":chudan},function(result){
    $("#content").html(result);
    $("#currentPageNumber").html(page);
  });
  }else{
  alert("您的页码输入错误");
  }
}
function tijiao(path){

	 var id = $("#id").val();
     var phone = $("#phone").val();
     var name = $("#name").val();
     var nation =$('#nation').val();
     var address =$('#address').val();
     var start_date =$('#start_date').val();
     var end_date =$('#end_date').val();
     var gerder = $('#gerder').val();
     var issuer = $('#issuer').val();
     
     var id1 = $("#id1").val();
     var phone1 = $("#phone1").val();
     var name1 = $("#name1").val();
     var nation1 =$('#nation1').val();
     var address1 =$('#address1').val();
     var start_date1 =$('#start_date1').val();
     var end_date1 =$('#end_date1').val();
     var gerder1 = $('#gerder1').val();
     var issuer1 = $('#issuer1').val();
     
     var code = $('#code').val();
     var ting = $('#ting').val();
     if(ting==0){
     alert("请选择营业厅");
     return;
     }
     if(code==null||code.length()==0){
	alert("请先获取验证码");
	}else{
     $.post(path+"lu1.jsp",{"id":id,"phone":phone,"name":name,"nation":nation,"address":address,"start_date":start_date,"end_date":end_date,"gerder":gerder,"issuer":issuer,
                                      "id1":id1,"phone1":phone1,"name1":name1,"nation1":nation1,"address1":address1,"start_date1":start_date1,"end_date1":end_date1,"gerder1":gerder1,"issuer1":issuer1,
                                      "code":code,"ting":ting
                                      },function(result){
    alert("信息提交"+result);
   });
   }
}
function getCode(path){
	 var id = $("#id").val();
     var phone = $("#phone").val();
     var name = $("#name").val();
     var nation =$('#nation').val();
     var address =$('#address').val();
     var start_date =$('#start_date').val();
     var end_date =$('#end_date').val();
     var gerder = $('#gerder').val();
     var issuer = $('#issuer').val();
     
     var id1 = $("#id1").val();
     var phone1 = $("#phone1").val();
     var name1 = $("#name1").val();
     var nation1 =$('#nation1').val();
     var address1 =$('#address1').val();
     var start_date1 =$('#start_date1').val();
     var end_date1 =$('#end_date1').val();
     var gerder1 = $('#gerder1').val();
     var issuer1 = $('#issuer1').val();
     
     var code = $('#code').val();
     var ting = $('#ting').val();
      if(ting==0){
     alert("请选择营业厅");
     return;
     }
     $.post(path+"lu1.jsp",{"id":id,"phone":phone,"name":name,"nation":nation,"address":address,"start_date":start_date,"end_date":end_date,"gerder":gerder,"issuer":issuer,
                                      "id1":id1,"phone1":phone1,"name1":name1,"nation1":nation1,"address1":address1,"start_date1":start_date1,"end_date1":end_date1,"gerder1":gerder1,"issuer1":issuer1,
                                      "code":code,"ting":ting
                                      },function(result){
    alert("获取验证码" +result);
   });
}
     function saveInfo(path){
     	var account = $("#account").val();
        var password = $("#password").val();
        var type = $("#type").val();
        var sam =$('#sam').val();
        var sam1 =$('#sam1').val();
        var url =$('#url').val();
        $.post(path+"p1.jsp",{"account":account,"password":password,"type":type,"sam":sam,"url":url,'sam1':sam1},function(result){
        alert(result);
      });
     }
      function tijiao1(path){
     	var info = $("#info").val();
        $.post(path+"test1.jsp",{"info":info},function(result){
        alert(result);
      });
     }
     function tong1(){
     var id = $("#id").val();
     var phone = $("#phone").val();
     var name = $("#name").val();
     var nation =$('#nation').val();
     var address =$('#address').val();
     var start_date =$('#start_date').val();
     var end_date =$('#end_date').val();
     var gerder = $('#gerder').val();
     var issuer = $('#issuer').val();
     
     $("#id1").val(id);
      $("#phone1").val(phone);
     $("#name1").val(name);
     $('#nation1').val(nation);
     $('#address1').val(address);
    $('#start_date1').val(start_date);
     $('#end_date1').val(end_date);
      $('#gerder1').val(gerder);
      $('#issuer1').val(issuer);
     
     }
      function chudan(path,code){
      	  var id = $("#id").val();
          var phone = $("#phone").val();
          var name = $("#name").val();
          var chudan = $('#chudan').val();
        $.post(path+"chudan.jsp",{"code":code},function(result){
        
         var id = $("#id").val();
      var phone = $("#phone").val();
      var name = $("#name").val();
      var currentPageNumber = $("#currentPageNumber").html();
  	     $.post(path+"user2.jsp",{"pageNumber":currentPageNumber,"id":id,"phone":phone,"name":name},function(result){
         $("#content").html(result);
        });
        alert(result);
      });
     }