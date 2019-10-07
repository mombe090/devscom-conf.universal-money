<?php

/*
|--------------------------------------------------------------------------
| Application Routes
|--------------------------------------------------------------------------
|
| Here is where you can register all of the routes for an application.
| It is a breeze. Simply tell Lumen the URIs it should respond to
| and give it the Closure to call when that URI is requested.
|
*/

$router->get('/presentation', function () use ($router) {
    return response()->json([
        'name' => 'Bank Service',
        'language' => 'PHP',
        'framework' => 'laravel/lumen',
        'version' => '6',
        'role' => 'Je suis le service qui interagit avec la banque x pour son service y',
        'desc' => 'We love microservice yes',
        'siteOfficiel' => 'https://lumen.laravel.com',
    ]);
});
