module.exports = {
  ignorePatterns: ['*/jquery.min.js', '*/lib/*', '*/vendor/*'], // 忽略检查jQuery文件
  env: {
    browser: true,
    es2021: true,
    node: true,
  },
  globals: {
    defineEmits: true,
    document: true,
    localStorage: true,
    GLOBAL_VAR: true,
    window: true,
    defineProps: true,
    defineExpose: true,
    withDefaults: true,
    $: true, // 添加对jQuery的支持
    jQuery: true,
  },
  extends: [
    './.eslintrc-auto-import.json',
    'airbnb-base',
    'plugin:@typescript-eslint/recommended',
    'plugin:vue/vue3-recommended',
    'plugin:prettier/recommended', // 添加 prettier 插件
  ],
  parserOptions: {
    ecmaVersion: 'latest',
    parser: '@typescript-eslint/parser',
    sourceType: 'module',
  },
  plugins: ['vue', '@typescript-eslint', 'import'],
  rules: {
    'no-console': 'off',
    'import/no-unresolved': 'off',
    'import/extensions': 'off',
    'import/no-extraneous-dependencies': 'off',
    'vue/multi-word-component-names': 'off', // 关闭组件命名规则
  },
};
