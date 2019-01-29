var path="";
$(document).ready(function() {
    path = getPath();
    initTable();
});
function initTable() {
    $('#tb').bootstrapTable({
        url: path+'/user/getUsers',         //请求后台的URL（*）
        method: 'get',                      //请求方式（*）
        //toolbar: '#toolbar',                //工具按钮用哪个容器
        striped: true,                      //是否显示行间隔色
        cache: true,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,                   //是否显示分页（*）
        sortable: false,                     //是否启用排序
        sortOrder: "asc",                   //排序方式
        //queryParams: oTableInit.queryParams,//传递参数（*）
        sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1,                       //初始化加载第一页，默认第一页
        pageSize: 10,                       //每页的记录行数（*）
        pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
        search: false,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: false,
        showColumns: true,                  //是否显示所有的列
        showRefresh: false,                  //是否显示刷新按钮
        minimumCountColumns: 2,             //最少允许的列数
        clickToSelect: true,                //是否启用点击选中行
        //height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
        uniqueId: "user_ID",                     //每一行的唯一标识，一般为主键列
        showToggle: false,                    //是否显示详细视图和列表视图的切换按钮
        cardView: false,                    //是否显示详细视图
        detailView: false,                   //是否显示父子表
        // rowStyle: function (row, index) {
        //     //这里有5个取值代表5中颜色['active', 'success', 'info', 'warning', 'danger'];
        //     var strclass = "success";
        //     // if (row.ORDER_STATUS == "待排产") {
        //     //     strclass = 'success';//还有一个active
        //     // }
        //     // else if (row.ORDER_STATUS == "已删除") {
        //     //     strclass = 'danger';
        //     // }
        //     // else {
        //     //     return {};
        //     // }
        //     return { classes: strclass }
        // },
        columns: [
        {
            checkbox: true
        },
        {
            field: 'user_ID',
            title: '用户ID',
            align: "center",
            width:120,
            editable:true
        }, {
            field: 'user_NAME',
            title: '用户名称',
            width:250,
            editable: {
                type: 'text',
                title: '用户名',
                validate: function (v) {
                    if (!v) return '用户名不能为空';

                }
            }
        }, {
            field: 'user_EMAIL',
            title: '邮箱',
            width:250,
            hidden:true
        }, {
            field: 'user_PHONE',
            title: '电话',
            width:150
        }],
        onLoadError: function(data){
            bootbox.alert({
                message:"123214",
                title:"温馨提示"
            });
        },
        onEditableSave: function (field, row, oldValue, $el) {
            $.ajax({
                type: "post",
                url: "/Editable/Edit",
                data: row,
                dataType: 'JSON',
                success: function (data, status) {
                    if (status == "success") {
                        alert('提交数据成功');
                    }
                },
                error: function () {
                    alert('编辑失败');
                },
                complete: function () {

                }

            });
        }
    });
}