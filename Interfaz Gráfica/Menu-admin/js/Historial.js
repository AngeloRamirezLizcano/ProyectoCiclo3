var columnDefs = [
    {headerName: 'Modelo',field: 'modelo', sortable: true, filter: true},
    {headerName: 'Fecha',field: 'Fecha', sortable: true, filter: true},
    {headerName: 'Propietario',field: 'propietario', sortable: true, filter: true},
    {headerName: 'Estadia en Horas',field: 'Estadia', sortable: true, filter: true},
    {headerName: 'Recaudo',field: 'Recaudo', sortable: true, filter: true}
];

var rowData = [
    {make: 'Toyota', model: 'Celica', price:3500},
    {make: 'Ford', model: 'Mondeo', price:3200},
    {make: 'Porsche', model: 'Celica', price:7500}
];

var gridOptions = {
    columnDefs: columnDefs,     
    //  rowData: rowData,
    rowSelection: 'multiple',
};


var eGridDiv = document.querySelector('#contenedor');

new agGrid.Grid(eGridDiv,gridOptions);

agGrid.simpleHttpRequest({url: './row-historial-data.json'})
      .then(data => {
          gridOptions.api.setRowData(data);
      });


    //   https://www.ag-grid.com/example-assets/row-data.json'