<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>HistoIRe's blog manage system</title>

    <!-- Bootstrap Core CSS -->
    <link href="../bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- DataTables CSS -->
    <link href="../bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="../bower_components/datatables-responsive/css/dataTables.responsive.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

	<script type="text/javascript" src="../js/jquery-1.11.1.js"></script>
	<script type="text/javascript" src="../js/jquery-ui.js"></script>
	
 	<%String stringhtml1 ="<tr class='odd gradeA'><td>9</td><td>a</td><td>a</td><td>a</td><td>null</td></tr><tr class='odd gradeA'><td>10</td><td>b</td><td>b</td><td>b</td><td>null</td></tr><tr class='odd gradeA'><td>11</td><td>c</td><td>c</td><td>c</td><td>null</td></tr><tr class='odd gradeA'><td>12</td><td>d</td><td>c</td><td>c</td><td>null</td></tr><tr class='odd gradeA'><td>13</td><td>e</td><td>c</td><td>c</td><td>null</td></tr>"; %>
	<%String stringhtml = request.getParameter("strHTML"); %>
	
	<script type="text/javascript">
		$(document).ready(function() { 
				$.ajax({url:"MessageServlet?method=select",success:function(result){
					  //window.alert(result);
					  //window.open("http://www.baidu.com");
				      $("#divSelectPublish").html(result);
				    }});
				$("#InsertButton").click(function() {
					$.ajax({url:"MessageServlet?method=insert&id="+$("#id").val()
														+"&content="+$("#content").val()
														+"&time="+$("#time").val()
														+"&name="+$("#name").val()
														+"&email="+$("#email").val(),success:function(result){
					     $("#spanChange").html(result);
					    }});
				});
				$("#DelectButton").click(function() {
					$.ajax({url:"MessageServlet?method=delect&id="+$("#id").val()
														+"&content="+$("#content").val()
														+"&time="+$("#time").val()
														+"&name="+$("#name").val()
														+"&email="+$("#email").val(),success:function(result){
								$("#spanChange").html(result);
					    }});
				});
				$("#UpdataButton").click(function() {
					$.ajax({url:"MessageServlet?method=updata&id="+$("#id").val()
														+"&content="+$("#content").val()
														+"&time="+$("#time").val()
														+"&name="+$("#name").val()
														+"&email="+$("#email").val(),success:function(result){
								$("#spanChange").html(result);
					    }});
				});
		});  
	</script>

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">HistoIRe's blog manage system</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Loading...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Loading...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Loading...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>Read All Messages</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-messages -->
                </li>
                <!-- /.dropdown -->
                
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-bell fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-alerts">
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-comment fa-fw"></i> New Comment
                                    <span class="pull-right text-muted small">Loading...</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-twitter fa-fw"></i> New Followers
                                    <span class="pull-right text-muted small">Loading...</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-envelope fa-fw"></i> Message Sent
                                    <span class="pull-right text-muted small">Loading...</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-tasks fa-fw"></i> New Task
                                    <span class="pull-right text-muted small">Loading...</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                    <span class="pull-right text-muted small">Loading...</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Alerts</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-alerts -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login.jsp"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                            </div>
                            <!-- /input-group -->
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Acrticle <span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="publish.jsp">Publish</a>
                                </li>
                                <li>
                                    <a href="recycle.jsp">Recycled</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="acrticletype.jsp"><i class="fa fa-table fa-fw"></i> Acrticle Type</a>
                        </li>
                        <li>
                            <a href="images.jsp"><i class="fa fa-edit fa-fw"></i> Images</a>
                        </li>
                        <li>
                            <a href="members.jsp"><i class="fa fa-sitemap fa-fw"></i> Member </a>
                        </li>
                         <li>
                            <a href="message.jsp"><i class="fa fa-edit fa-fw"></i> Messages</a>
                        </li>                        
                        <li>
                            <a href="login.jsp"><i class="fa fa-files-o fa-fw"></i> ReLogin </a>
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Message</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Message
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                        	<div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">Change info</a>
                                        </h4>
                                    </div>
                                    <div id="collapseTwo" class="panel-collapse collapse">
                                        <div class="panel-body">
											<div class="form-group">
                                            	<label>Change Id</label>
                                            	<input id="id" class="form-control" placeholder="Id">
                                            	<label>Change Content</label>
                                            	<input id="content" class="form-control" placeholder="Content">
                                            	<label>Change Time</label>
                                            	<input id="time" class="form-control" placeholder="Add Time [yyyy-mm-dd hh:mm:ss]">
												<label>Change Visitor Name</label>
                                            	<input id="name" class="form-control" placeholder="Visitor Name">
                                            	<label>Change Visitor Email</label>
                                            	<input id="email" class="form-control" placeholder="Visitor Email">
                                            	<br>
                                            	<button id="InsertButton" type="button" class="btn btn-primary btn-lg btn-block">Publish Article Insert Acknowledge</button>
                                            	<button id="DelectButton" type="button" class="btn btn-primary btn-lg btn-block">Publish Article Delect Acknowledge</button>
                                            	<button id="UpdataButton" type="button" class="btn btn-primary btn-lg btn-block">Publish Article Update Acknowledge</button>
                                            	<span id="spanChange"></span>
                                       		</div>
                                        </div>
                                    </div>
                                </div>
                            <!----------------- begin ---------------->
                            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>Message Id</th>
                                            <th>Message Content</th>
                                            <th>Message Add Time</th>
                                            <th>Message Visitor Name</th>
                                            <th>Message Visitor Email</th>
                                        </tr>
                                    </thead>
                                    <tbody id = divSelectPublish>
                           				<!--id = divSelectPublish  -->
<%-- 									<%= request.getParameter("PublishServlet") %>--%>
                             		</tbody>
                                </table>
                            </div>
                            <!-- 
                            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Rendering engine</th>
                                            <th>Browser</th>
                                            <th>Platform(s)</th>
                                            <th>Engine version</th>
                                            <th>CSS grade</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                     <tr class="odd gradeA">
                                            <td>Trident</td>
                                            <td>Internet Explorer 5.5</td>
                                            <td>Win 95+</td>
                                            <td class="center">5.5</td>
                                            <td class="center">A</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            -->
                            <!------------------ end ------------------->
                            <!-- /.table-responsive -->
                            
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="../bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="../bower_components/datatables/media/js/jquery.dataTables.min.js"></script>
    <script src="../bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
    	asd();
        $('#dataTables-example').DataTable({
                responsive: true
        });
        
    });
    </script>

</body>

</html>

