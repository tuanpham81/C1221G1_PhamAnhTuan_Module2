package case_study_furama.services.impl;

import case_study_furama.models.Booking;
import case_study_furama.services.BookingService;
import case_study_furama.utils.BookingComaprator;

import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    static Set<Booking>  bookingSet = new TreeSet<>(new BookingComaprator());
    @Override
    public void addNew() {

    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }
}
