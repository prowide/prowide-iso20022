
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reports on reservations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentAndDefaultReservation1", propOrder = {
    "curRsvatn",
    "dfltRsvatn"
})
public class CurrentAndDefaultReservation1 {

    @XmlElement(name = "CurRsvatn")
    protected List<ReservationReport3> curRsvatn;
    @XmlElement(name = "DfltRsvatn")
    protected List<ReservationReport3> dfltRsvatn;

    /**
     * Gets the value of the curRsvatn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curRsvatn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurRsvatn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationReport3 }
     * 
     * 
     */
    public List<ReservationReport3> getCurRsvatn() {
        if (curRsvatn == null) {
            curRsvatn = new ArrayList<ReservationReport3>();
        }
        return this.curRsvatn;
    }

    /**
     * Gets the value of the dfltRsvatn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dfltRsvatn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltRsvatn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationReport3 }
     * 
     * 
     */
    public List<ReservationReport3> getDfltRsvatn() {
        if (dfltRsvatn == null) {
            dfltRsvatn = new ArrayList<ReservationReport3>();
        }
        return this.dfltRsvatn;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the curRsvatn list.
     * @see #getCurRsvatn()
     * 
     */
    public CurrentAndDefaultReservation1 addCurRsvatn(ReservationReport3 curRsvatn) {
        getCurRsvatn().add(curRsvatn);
        return this;
    }

    /**
     * Adds a new item to the dfltRsvatn list.
     * @see #getDfltRsvatn()
     * 
     */
    public CurrentAndDefaultReservation1 addDfltRsvatn(ReservationReport3 dfltRsvatn) {
        getDfltRsvatn().add(dfltRsvatn);
        return this;
    }

}
