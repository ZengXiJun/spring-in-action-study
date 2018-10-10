package com.jesse.chapter3.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cripsy")
public class Cookies implements Dessert{

}
