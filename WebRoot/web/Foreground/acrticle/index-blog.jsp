<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
  <meta charset=utf-8"utf-8" />
    <title>HistoIRe's Blog</title>
    <meta name="author" content="HistoIRe" />
    <meta name="renderer" content="webkit">
    <meta name="description" content="HistoIRe's Blog" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <link rel="stylesheet" href="js/default.css" tppabs="http://histoire.xyz/css/default.css" type="text/css" />
    <link rel="shortcut icon" href="../favicon.ico" type="image/x-icon" />
    <link rel="alternate" type="application/atom+xml" title="Recent Entries" href="" />
    <script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
	<script type="text/javascript" src="js/jquery-ui.js"></script>

	<script type="text/javascript">
		$(document).ready(function() { 
				//window.open("http://www.baidu.com");	
				$.ajax({url:"ForegroundAcrticleCatalogServlet?method="+$(" ").val(),success:function(result){
					  //window.alert(result);
					  //window.open("http://www.baidu.com");
				      $("#divSelectPublish").html(result);
				    }});
		});  
	</script>

</head>
<body>

    <div class="home-menu">
        <div class="home-icon-con">
            <a class="home-menu-icon" href="../index/index.jsp" tppabs="http://histoire.xyz/">HistoIRe</a>
        </div>  
    </div>

    <link rel="stylesheet" href="js/prettify.css" tppabs="http://histoire.xyz/js/prettify/prettify.css" />
<style type="text/css">
    body { background:#e8e8e8; }
    @media screen and (max-width: 750px){
        body { background:#fff; }
    }
    @media screen and (max-width: 1020px){
        body { background:#fff; }
    }
</style>

<div id="content">
	
    <div class="entry"  >
    	<div id=divSelectPublish>
		</div> 
    </div>
    
	<!--
    <div class="sidenav">
  
        <iframe width="100%" height="75" class="share_self"  frameborder="0" scrolling="no" src="http://widget.weibo.com/weiboshow/index.php?language=&width=0&height=75&fansRow=2&ptype=1&speed=0&skin=5&isTitle=0&noborder=0&isWeibo=0&isFans=0&uid=1855270953&verifier=375b89d6&dpc=1"></iframe>
      
    </div>
	-->
    <div class="sidenav">
        <h2>Blog</h2>
        <ul class="artical-list">
        </ul>

        <h2>Opinion</h2>
        <ul class="artical-list">
			<!-- <li><a href="blog-helloworld.html">hello world</a></li> -->        
        </ul>

        <h2>Project</h2>
        <ul class="artical-list">
        
        </ul>
    </div>
</div>

<script src="js/post.js" type="text/javascript"></script>


    <script type="text/javascript">
        $(function(){
            $('.home-follow').click(function(e){
                e.preventDefault();

                if($('.home-contact').is(':visible')){
                    $('.home-contact').slideUp(100);
                }else{
                    $('.home-contact').slideDown(100);
                }
            });
        })
    </script>
</body>
</html>

