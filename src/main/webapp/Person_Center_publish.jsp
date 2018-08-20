<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>个人中心 发布</title>
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

	<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
	<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<link href="css/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" href="css/style1.css">
	<link href="css/buttons.css" rel="stylesheet">
	<link rel="stylesheet" href="css/style.css">


</head>

<body>

<nav>
	<a href="#" id="userPLink">
		<span class="fa fa-user"></span> 名字
	</a>
	<div id="sideMenu">
		<span class="fa fa-navicon" id="sideMenuClosed"></span>
	</div>
</nav>


<div id="sideMenuContainer">
	<h2>个人中心</h2>
	<a href="#" title="查看发言 "><span class="fa fa-bolt"></span></a>
	<a href="#" title="发布"><span class="fa fa-exclamation-circle"></span></a>
</div>

<!--中间-->
<main class="main container clearfix">

	<section class="article-view">
		<h2 class="article-title">
			Posts
		</h2>
		<div class="block">
			<div>
				<form id="my_From" method="post" action="publishpost">
					<table>
						<tbody>
						<tr>
							<td>
								标题:
							</td>
							<td>
								<input name="post.title" class="init" maxlength="6" type="text" placeholder="Title" style="border-radius: 10px;height: 35px;width: 200px;margin: 10px 0;outline: none;">
							</td>
							<td>
							</td>
						</tr>
						<tr>
							<td>
								内容:
							</td>
							<td>
										<textarea name="post.text" class="init" maxlength="100" rows="4" style="border-radius: 10px; width: 500px;height: 200px;margin: 10px 0px;
										outline: none;resize: none;"></textarea>
							</td>
						</tr>
						<tr>
							<td>

							</td>
							<td>
								<button type="submit" class="btn" style="margin: 10px 0;">发布</button>
							</td>
						</tr>

						</tbody>
					</table>
				</form>
			</div>
		</div>

	</section>
</main>

<script src='js/velocity.min.js'></script>
<script src='js/sideToggleExtended.js'></script>
<script type="text/javascript">
    var Error_msg;
    $(document).ready(function() {
        $('#sideMenu').sideToggle({
            moving: '#sideMenuContainer',
            direction: 'right'
        });

        $('#my_From input').blur(function () {
            $parent=$(this).parent();
            $parent.find(".onError").remove();
            if($(this).val()==''){
                Error_msg='输入标题不能为空';
                $parent.append('<span class="onError">'+Error_msg+'</span>');
            }else if($(this).val().length==6){
                Error_msg='标题不能超过6个字';
                $parent.append('<span class="onError">'+Error_msg+'</span>');
            }
        }).keyup(function () {
            $(this).triggerHandler('blur');
        }).focus(function () {
            $(this).triggerHandler('blur');
        })
    });
</script>
</body>
</html>
