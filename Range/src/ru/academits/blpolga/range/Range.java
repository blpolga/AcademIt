package ru.academits.blpolga.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return number >= from && number <= to;
    }

    public void printLength() {
        System.out.println("Длина диапазона = " + getLength());
    }

    public static void printArrayUnion(Range[] intervalUnion) {
        for (Range element : intervalUnion) {
            System.out.println("Обединение интервалов с " + element.from + " по " + element.to);
        }
    }

    public static void printArrayDifference(Range[] intervalDifference) {
        if (intervalDifference.length == 0) {
            System.out.println("Разность равна нулю");
            return;
        }

        for (Range element : intervalDifference) {
            System.out.println("Разность интервалов с " + element.from + " по " + element.to);
        }
    }

    public Range getIntersection(Range range) {
        double maxFrom = Math.max(from, range.from);
        double minTo = Math.min(to, range.to);
        if (maxFrom >= minTo) {
            return null;
        }
        return new Range(maxFrom, minTo);
    }

    public Range[] getUnion(Range range) {
        double maxFrom = Math.max(from, range.from);
        double maxTo = Math.max(to, range.to);
        double minFrom = Math.min(from, range.from);
        double minTo = Math.min(to, range.to);

        if (maxFrom > minTo) {
            return new Range[]{new Range(minFrom, minTo), new Range(maxFrom, maxTo)};
        } else {
            return new Range[]{new Range(minFrom, maxTo)};
        }
    }

    public Range[] getDifference(Range range) {
        if (from <= range.to && range.to <= to && from > range.from) {
            return new Range[]{new Range(range.to, to)};
        } else if (from >= range.from && to <= range.to) {
            return new Range[]{};
        } else if (to < range.from || from > range.to) {
            return new Range[]{new Range(from, to)};
        } else if (range.from <= to && to <= range.to) {
            return new Range[]{new Range(from, range.from)};
        } else if (range.from == from && range.to < to) {
            return new Range[]{new Range(range.to, to)};
        } else {
            return new Range[]{new Range(from, range.from), new Range(range.to, to)};
        }
    }
}