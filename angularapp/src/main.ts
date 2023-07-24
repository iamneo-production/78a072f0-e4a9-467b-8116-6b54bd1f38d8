<<<<<<< HEAD
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
=======
import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { environment } from './environments/environment';

if (environment.production) {
  enableProdMode();
}
>>>>>>> f33740ef39940d9c8a55672afe185f13c71bd61a


platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));
