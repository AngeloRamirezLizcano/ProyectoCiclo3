

var columnDefs = [
    {headerName: 'Modelo',field: 'modelo', sortable: true, filter: true},
    {headerName: 'Tiempo de Inicio',field: 'tiempoInicio', sortable: true, filter: true},
    {headerName: 'Propietario',field: 'propietario', sortable: true, filter: true},
    {headerName: 'Puesto',field: 'puesto', sortable: true, filter: true},
    {headerName: 'Estado',field: 'estado', sortable: true, filter: true, cellRenderer:'funcionalidadBoton', minWidth: 175}
];

var rowData = [
    {make: 'Toyota', model: 'Celica', price:3500},
    {make: 'Ford', model: 'Mondeo', price:3200},
    {make: 'Porsche', model: 'Celica', price:7500}
];

var gridOptions = {
    columnDefs: columnDefs,     
    //  rowData: rowData,
    components: {
        funcionalidadBoton:TotalPagar,
    },
    rowSelection: 'multiple',
    
};


var eGridDiv = document.querySelector('#contenedor');

new agGrid.Grid(eGridDiv,gridOptions);

agGrid.simpleHttpRequest({url: './row-data.json'})
      .then(data => {
          gridOptions.api.setRowData(data);
      });


    //   https://www.ag-grid.com/example-assets/row-data.json'