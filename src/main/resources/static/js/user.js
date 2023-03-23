// Call the dataTables jQuery plugin
$(document).ready(function() {
  chargeUser();
  $('#user').DataTable();
});

async function chargeUser() {

    const request = await fetch('users', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
    });
    const users = await request.json();

    let listHtml = '';

    for (let user of users) {
      let userHtml = '<tr><th>'+user.first_name+' '+user.last_name+'</th><th>'+user.email+'</th><th>'+user.cel+'</th><th>Button</th></tr>';

      listHtml += userHtml;
    }
    document.querySelector('#user tbody').outerHTML = listHtml;


} 

