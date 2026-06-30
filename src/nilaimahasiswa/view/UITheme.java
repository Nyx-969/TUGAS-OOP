package nilaimahasiswa.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

public class UITheme {

    // ── Palet Hijau Sage / Forest (nyaman di mata) ─────────────────────────
    public static final Color SIDEBAR        = new Color(39,  78,  54);   // forest hijau gelap
    public static final Color SIDEBAR_HOVER  = new Color(52, 101,  69);   // hover sedikit lebih terang
    public static final Color PRIMARY        = new Color(74, 139,  93);   // sage hijau utama
    public static final Color PRIMARY_DARK   = new Color(52, 105,  70);   // sage lebih gelap
    public static final Color BACKGROUND     = new Color(245, 249, 246);  // putih kehijau-an lembut
    public static final Color CARD           = Color.WHITE;
    public static final Color TEXT_DARK      = new Color(28,  46,  34);   // hijau tua untuk teks
    public static final Color TEXT_MUTED     = new Color(110, 140, 118);  // abu-hijau untuk teks sekunder
    public static final Color DANGER         = new Color(192,  57,  43);  // merah bata
    public static final Color SUCCESS        = new Color(60,  160,  90);  // hijau sukses

    // ── Tipografi ──────────────────────────────────────────────────────────
    public static final Font FONT_TITLE    = new Font("Segoe UI", Font.BOLD,  22);
    public static final Font FONT_SUBTITLE = new Font("Segoe UI", Font.PLAIN, 13);
    public static final Font FONT_LABEL    = new Font("Segoe UI", Font.PLAIN, 13);
    public static final Font FONT_BUTTON   = new Font("Segoe UI", Font.BOLD,  13);
    public static final Font FONT_NAV      = new Font("Segoe UI", Font.PLAIN, 14);

    // ── Gaya Tombol ───────────────────────────────────────────────────────
    public static void styleButtonPrimer(JButton btn) {
        btn.setBackground(PRIMARY);
        btn.setForeground(Color.WHITE);
        btn.setFont(FONT_BUTTON);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setOpaque(true);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    public static void styleButtonOutline(JButton btn, Color warna) {
        btn.setBackground(Color.WHITE);
        btn.setForeground(warna);
        btn.setFont(FONT_BUTTON);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createLineBorder(warna, 1, true));
        btn.setOpaque(true);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    // ── Gaya Tabel ────────────────────────────────────────────────────────
    public static void styleTable(JTable table) {
        table.setRowHeight(30);
        table.setFont(FONT_LABEL);
        table.setSelectionBackground(new Color(195, 225, 200));  // hijau muda lembut
        table.setSelectionForeground(TEXT_DARK);
        table.setGridColor(new Color(210, 230, 213));            // garis tabel hijau pucat

        JTableHeader header = table.getTableHeader();
        header.setFont(FONT_BUTTON);
        header.setBackground(SIDEBAR);
        header.setForeground(Color.WHITE);
        header.setPreferredSize(new Dimension(0, 34));
    }

    public static void styleTable(JTable table, int... bobotKolom) {
        styleTable(table);
        javax.swing.table.TableColumnModel cm = table.getColumnModel();
        int total = 0;
        for (int b : bobotKolom) total += b;
        if (total <= 0 || cm.getColumnCount() != bobotKolom.length) return;
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        for (int i = 0; i < bobotKolom.length; i++) {
            int width = Math.round(600f * bobotKolom[i] / total);
            cm.getColumn(i).setPreferredWidth(width);
        }
    }
}
