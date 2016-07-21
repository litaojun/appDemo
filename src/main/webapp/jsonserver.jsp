<!DOCTYPE HTML>
<html>
<head>
<script type="text/javascript" src="Public/js/jquery-easyui-1.3.1/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
    $(function(){
        //按钮单击时执行
        $("#testAjax").click(function(){
              
              //Ajax调用处理
            var html = $.ajax({
               type: "POST",
               url: "test.php",
               data: "name=garfield&age=18",
               async: false

            }).responseText;
            $("#myDiv").html('<h2>'+html+'</h2>');
         });
    });
</script>    
</head>
    <body>
        <div id="myDiv"><h2>通过 AJAX 改变文本</h2></div>
        <button id="testAjax" type="button">Ajax改变内容</button>
    </body>
</html>