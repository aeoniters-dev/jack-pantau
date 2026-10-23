# Jack Pantau — app telefon (pantau sahaja)
- Live: https://aeoniters-dev.github.io/jack-pantau/  · APK: https://github.com/aeoniters-dev/jack-pantau/releases/download/apk-v1/JackPantau.apk
- Repo GitHub: aeoniters-dev/jack-pantau (GitHub Pages dari main /root). APK = WebView buka link di atas (android/, GitHub Actions "Bina APK" -> Release apk-v1). Isi app update sendiri bila index.html di repo berubah; APK baru hanya jika android/ berubah.
- Fail: index_src.html (sumber, __URL__/__KEY__) -> index.html (kunci dari UI\lesen.py, skrip python dalam serah tugas). sw.js: naikkan versi cache (jp-vN) setiap ubah.
- ADMIN: AKAUN, P/L 5 tab, EA, POSISI (dari app PC ADMIN, SQL 16 admin_pantau, 60 s) + KESIHATAN semua client + TUTUP PC / PAKSA (perintah_hantar).
- CLIENT (perlu SQL 17 + app PC v0.3.54): akaun sendiri (pantau_saya) + PC SAYA (perintah_saya). Sebelum SQL 17: mesej "belum diaktifkan".
- Akaun Claude baru: sambung GitHub di claude.ai Settings -> Connectors, pasang Claude GitHub App pada repo jack-pantau (Only select repositories).
