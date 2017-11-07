<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/6
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FrameWork 协作</title>
    <script src="https://unpkg.com/vue" type="text/javascript"></script>
</head>
<body>
    <div id="app">
        <p>{{message}}</p>
        <section>
            {{title}} : {{content}}
        </section>
        <input v-model="message"/>
        {{counts}}
        <button class="button" v-on:click="changeVal">改变值</button>
        
        
    </div>
    <script>
        var vm = new Vue({
            el : '#app',
            data:{
                title : '我是标题',
                message : '我是消息体',
                content : '我是真正的正文内容',
                counts : 0
            },
            methods : {
                changeVal : function (event)
                {
                    vm.message = event.target.tagName;
                    console.info(event.target.textContent);
                }
            }
        });
        //可以用后来的内容直接被替换
        vm.message = '我是被替换的内容.';
        
        
        
        
        
    </script>
</body>
</html>
