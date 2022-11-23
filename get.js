$("document").ready(function(){
    
    $("#GETbtn").click( function(){
        var id=$("#id").val();
        console.log(`http://localhost:3000/team/${id}`);
        $.get(`http://localhost:3000/team/${id}`, function(data){
            console.log(data);
            $("#response").text(data);
         });

    });
    
});

