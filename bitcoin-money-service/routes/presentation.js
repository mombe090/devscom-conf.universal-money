var express = require('express');
var router = express.Router();

/* GET users listing. */
router.get('/', function(req, res, next) {
  console.log('Fetching data on bitcoin money service');
  res.json({
    'name' :'Bitcoin Service',
    'language' :'JAVASCRIPT',
    'framework' :'express',
    'version' :'4',
    'role' :'Je suis le service qui interagit avec les api pour le service bitcoin de l\'universal money',
    'desc' :'We love microservice yes, and docker is amazing',
    'siteOfficiel' :'https://expressjs.com/fr/'
  });
});

module.exports = router;
