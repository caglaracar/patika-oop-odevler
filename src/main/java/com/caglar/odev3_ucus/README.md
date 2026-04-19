# Ödev 3 - Uçuş Yönetim Sistemi

## Problem
- Hava yolu şirketleri uçuşları gerçekleştirir; her şirketin bir id'si vardır.
- Şirketin farklı tipte uçakları vardır; uçak çalışır ya da onarımdadır.
- Her uçuşun benzersiz id'si, kalkış/iniş havaalanı ve saatleri vardır.
- Her uçuşun bir pilotu ve yardımcı pilotu vardır.
- Havaalanlarının id ve ismi vardır.
- Pilotların deneyim seviyesi vardır.
- Uçak tipi belirli sayıda pilota ihtiyaç duyar.

## Sınıflar
- `HavaYoluSirketi` — uçak, pilot, uçuş listelerini tutar.
- `Ucak` — kuyruk no, tip, gerekli pilot sayısı, durum.
- `UcakDurumu` (enum) — `CALISIYOR`, `ONARIMDA`.
- `Pilot` — ad, soyad, deneyim seviyesi.
- `Havaalani` — id, ad.
- `Ucus` — uçuş no, kalkış/iniş havaalanı, saatler, uçak, pilot, yardımcı pilot.

## OOP Kavramları
- **Composition**: `Ucus` → `Ucak`, `Pilot`, `Havaalani`.
- **Encapsulation**: tüm alanlar `private`, getter/setter ile erişim.
- **Enum**: uçak durumu için tip güvenli sabitler.

## Çalıştırma
`Main.java` → THY için uçak, pilot ve uçuş tanımlanır, bilgileri yazdırılır.
