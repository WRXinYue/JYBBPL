// i18n
import { createI18n } from 'vue-i18n';
import ElementPlus from 'element-plus';
import messages from '@intlify/vite-plugin-vue-i18n/messages';
// vue router
import router from '@/router/index';
// pinia
import store from '@/store';
import 'element-plus/dist/index.css';
import App from './App.vue';
import './assets/styles/index.scss';

import 'virtual:windi.css';
// Devtools: https://windicss.org/integrations/vite.html#design-in-devtools
import 'virtual:windi-devtools';

const i18n = createI18n({
  locale: 'en',
  messages,
});

const app = createApp(App);

app.use(router).use(store);

app.use(ElementPlus);

app.use(i18n);

app.mount('#app');
