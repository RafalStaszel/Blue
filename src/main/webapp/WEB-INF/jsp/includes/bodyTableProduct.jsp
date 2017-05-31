<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false" %>
<html>
<head>
    <title>Data Intel</title>
</head>
<body>
<div>
    <img class="dataTableExample" src="resources/images/logo.jpg">
</div>
<table id="example" class="display" cellspacing="0" width="100%" style="overflow-x:auto">
    <thead>
    <tr>
        <th>Lp</th>
        <th>System</th>
        <th>Opis</th>
        <th>Klient</th>
    </tr>
    </thead>
</table>

</body>
</html>
<script type="text/javascript">
    $(document).ready(function () {
        var data = eval('${productList}');
        var table = $('#example').DataTable({
            "aaData": data,
            "aoColumns": [
                {"mData": "id"},
                {"mData": "system"},
                {"mData": "sytemDiscription"},
                {"mData": "systemOwner"},
            ],
            "paging": false
        });
    });
</script>

