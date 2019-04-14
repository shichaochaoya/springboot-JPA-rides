<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/html" xmlns="http://www.w3.org/1999/html">
<head>
    <title>Dharma Mall Homepage</title>

    <link rel="stylesheet" href="/css/index.css" />

    <script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.min.js"></script>

</head>
</body>
<h1 id="title">${title}</h1>
<p></p>
<p></p>
<p></p>
<p></p>
<p></p>


<script>
    $(function () {
        $('#title').click(function () {
            $.ajax({
                url:"http://localhost:8081/api/hello",
                type: "POST",
                data:{
                    name: "dharma"
                },
                success: function (data,status) {
                    console.log(status);
                    $('p').html(data.action + " " + data.name);
                }
            })
        })
    });
</script>
</body>
</html>