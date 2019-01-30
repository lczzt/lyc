var path="";
$(document).ready(function() {
    var pathName = document.location.pathname;
    var index = pathName.substr(1).indexOf("/");
    path = pathName.substr(0,index+1);
    //initMenu();
});
// function initMenu() {
//     var data = {
//         userType:"YY"
//     };
//     $.ajax({
//         type : "POST",
//         url : path+"/user/test",
//         data : data,
//         dataType : "json",
//         success : function(data) {
//             alert(data);
//         },
//         error : function(data) {
//             alert(data);
//         }
//     });
// }
function clickMenu(menuId,_this) {
    addOrRemoveClass(_this);
    var data = {
        menuId:menuId
    };
    $.ajax({
        type : "POST",
        url : path+"/user/querySecondMenu",
        data : data,
        dataType : "json",
        success : function(data) {
            if(data.success){
                var data = data.data;
                var html = "";
                for (var i=0;i<data.length;i++){
                    if(i == 0 ){
                        html +='<p class="text-center secondMenu" onclick="clickSecond(this,\''+data[i].router_LINK+'\')" style="cursor: pointer;float: left;width: 120px">'+data[i].menu_TEXT+'</p>';
                    }else{
                        html +='<p class="text-center secondMenu" onclick="clickSecond(this,\''+data[i].router_LINK+'\')" style="cursor: pointer;float: left;width: 120px;margin-left: 35px">'+data[i].menu_TEXT+'</p>';
                    }
                }
                $(".SecondMenu").html(html);
                clickSecond($(".SecondMenu P")[0],data[0].router_LINK);
            }else{
                bootbox.alert({
                    message:data.msg,
                    title:"温馨提示"
                });
            }

        },
        error : function(data) {
            bootbox.alert({
                message:data.msg,
                title:"温馨提示"
            });
        }
    });
}
function clickSecond(_this,url){
    addOrRemoveClass(_this);
    $("#reportFrame").attr("src", url);
}
function  addOrRemoveClass(_this) {
    $(_this).addClass('menuStyle');
    $(_this).parent().children().not(_this).removeClass('menuStyle');
}