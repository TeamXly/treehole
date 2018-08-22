<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: a10.11.5
  Date: 2018/8/21
  Time: 下午5:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h4>欢迎来到精品贴</h4>
    <s:iterator value="posts">
        <div class="kuang">
            <ul class="article-list">
                <li>
                    <a href="" class="article-item">
                        <h3><span>Time :
                                <s:if test="publishedtime.length() > 15">
                                    <s:property value="publishedtime.substring(0,14)"/>...
                                </s:if>
                                <s:else>
                                    <s:property value="publishedtime"/>
                                </s:else>
                                </span><s:property value="title"/></h3>
                        <p><s:property value="text"/></p>
                    </a>
                </li>
                <li class="xia">
                    <div class="zan"><span class="jia1">👍 <b>0</b></span><span class="jia2">👎 <b>0</b></span>
                        <span class="comm-p">评论</span>
                        <span class="fenX">分享
                                    <div class="fen">
                                        <a href="">新浪微博</a>
                                        <a href="">QQ空间</a>
                                        <a href="">腾讯微博</a>
                                    </div>
                                </span>
                    </div>
                    <div class="comm">
                        <hr>
                        <ul class="list">

                        </ul>
                        <textarea name="" class="ping" cols="30" rows="10">请不要发表与本内容无关的评论，您有了账号就是有身份的人了，我们可认识您。</textarea>
                        <button class="fa">发表</button>
                    </div>
                </li>
            </ul>
        </div>
    </s:iterator>

</body>
</html>
