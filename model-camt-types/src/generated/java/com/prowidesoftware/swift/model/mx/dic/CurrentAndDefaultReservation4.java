
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
@XmlType(name = "CurrentAndDefaultReservation4", propOrder = {
    "curRsvatn",
    "dfltRsvatn"
})
public class CurrentAndDefaultReservation4 {

    @XmlElement(name = "CurRsvatn")
    protected List<ReservationReport6> curRsvatn;
    @XmlElement(name = "DfltRsvatn")
    protected List<ReservationReport6> dfltRsvatn;

    /**
     * Gets the value of the curRsvatn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the curRsvatn property.
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
     * {@link ReservationReport6 }
     * 
     * 
     * @return
     *     The value of the curRsvatn property.
     */
    public List<ReservationReport6> getCurRsvatn() {
        if (curRsvatn == null) {
            curRsvatn = new ArrayList<>();
        }
        return this.curRsvatn;
    }

    /**
     * Gets the value of the dfltRsvatn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dfltRsvatn property.
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
     * {@link ReservationReport6 }
     * 
     * 
     * @return
     *     The value of the dfltRsvatn property.
     */
    public List<ReservationReport6> getDfltRsvatn() {
        if (dfltRsvatn == null) {
            dfltRsvatn = new ArrayList<>();
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
    public CurrentAndDefaultReservation4 addCurRsvatn(ReservationReport6 curRsvatn) {
        getCurRsvatn().add(curRsvatn);
        return this;
    }

    /**
     * Adds a new item to the dfltRsvatn list.
     * @see #getDfltRsvatn()
     * 
     */
    public CurrentAndDefaultReservation4 addDfltRsvatn(ReservationReport6 dfltRsvatn) {
        getDfltRsvatn().add(dfltRsvatn);
        return this;
    }

}
