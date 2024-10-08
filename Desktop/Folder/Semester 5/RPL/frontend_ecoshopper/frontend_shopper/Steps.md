## Langkah Membuat React App

### Tahap Create React App
1. Membuka terminal untuk membentuk app React dengan Typescript, menggunakan command:
```c
npx create-react-app nama-project --template typescript
```
### Tahap Integrasi Tailwind CSS
1. Melakukan instalasi Tailwind CSS di dalam directory React menggunakan command:
```c
cd nama-project
// Pindah ke React Directory
```

```c
npm install -D tailwindcss postcss autoprefixer
// Install tailwind CSS + dependensinya

// -D artinya dependensi hanya diperlukan saat development saja.

// postcss autoprefixer: untuk membantu Tailwind CSS menghasilkan CSS yang siap digunakan, compact dengan browser. 
```

```c
npx tailwindcss init -p
// Menginisialisasi Tailwind CSS.
```
2. Memodifikasi `tailwind.config.js` dengan menambahkan content menjadi `"./src/**/*.{js,jsx,ts,tsx}"`.

3. Menambahkan directory Tailwind CSS ke `src/index.css`.

### Menambahkan React Router
1. Melakukan instalasi React Router
```c
npm install react-router-dom
```

2. Membentuk desain routing (sesuai kebutuhan).
