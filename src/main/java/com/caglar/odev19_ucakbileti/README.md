# Ödev 19 - Uçak Bileti Fiyat Hesaplama

## Problem
Mesafe (km), yaş ve yolculuk tipine göre bilet fiyatı hesaplanır.
- KM başına: 0.10 TL
- Geçerlilik kontrolü: mesafe ve yaş pozitif; tip 1 veya 2 olmalı. Aksi halde "Hatalı Veri Girdiniz !"

## İndirimler
- Yaş < 12 → %50
- 12 ≤ Yaş ≤ 24 → %10
- Yaş > 65 → %30
- Gidiş-Dönüş (tip=2) → ayrıca %20 + toplam 2 ile çarpılır

## Örnek Hesap (1500 km, 20 yaş, tip=2)
- Normal: 150 TL → %10 yaş = 15 TL → 135 TL
- Gidiş-Dönüş: 135 * 0.20 = 27 → (135-27) * 2 = **216 TL**

## Çalıştırma
`Main.java` çalıştırılır.
