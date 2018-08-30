<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="zh">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>审核 查看</title>
	<link href="images/shu.png" rel="shortcut icon" />
	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<link href="css/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" href="css/style1.css">
	<link href="css/buttons.css" rel="stylesheet">

</head>

<body>

	<nav>
		<a href="#" id="userPLink">
			<span class="fa fa-user"></span> 审核帖子
		</a>
		<div id="sideMenu">
			<span class="fa fa-navicon" id="sideMenuClosed"></span>
		</div>
	</nav>


	<div id="sideMenuContainer">
		<h2>审核中心</h2>
		<a href="Auditing" title="审核帖子 "><span class="fa fa-bolt"></span></a>
        <a href="post" title="返回首页"><span class="fa fa-home"></span></a>
	</div>

	<!--中间-->

	<div class="main">
		<h2 class="main_title">
			审核中心
		</h2>
		<s:iterator value="Auditing">
		<div class="main_article">
			<input class="main_article_input" style="display: none" value="<s:property value="isboutique"/>">
			<h3><span><s:property value="title" /></span></h3>
			<div class="main_article_content">
				<s:property value="text"/>
			</div>
			<input class="input_postid" style="display: none" value="<s:property value="postid"/>">
			<input class="input_isboutique" style="display: none" value="<s:property value="isboutique"/>">
			<form action="ManagerWatchDetailed" method="post" id="form1">
				<input class="input_postid" style="display: none" name="comment.c_postid"  type="text" value="<s:property value="postid"/>">
				<div class="main_article_button">
					<input class="button button-rounded button-tiny" type="submit" value="查看详情">
					<%--<a href="Auditing_Detailed.jsp">查看详情</a>--%>
			</div>
			</form>
		</div>
		</s:iterator>
	</div>

	<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
	<script src='js/velocity.min.js'></script>
	<script src='js/sideToggleExtended.js'></script>
	<script src="js/detailed.js"></script>
	<script src="js/Auditing.js"></script>
	<script type="text/javascript">
/*		$(document).ready(function() {
			$('#sideMenu').sideToggle({
				moving: '#sideMenuContainer',
				direction: 'right'
			});

            $('.main_article_input').each(function () {
                var $this=$(this);
                console.log($this.val());

                if($this.val()=='true'){
                    console.log("成功");
                    $this.next().find('span').prepend("<img src='images/精品.png'/>");
                }
            })
		});*/
	</script>
</body>
</html>
