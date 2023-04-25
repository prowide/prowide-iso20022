
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
 * Specifies the yield performance indicators for the fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Yield1", propOrder = {
    "cmltvRtrsBrkdwn",
    "stdPrtflVoltlyBrkdwn",
    "shdwPrtflVoltlyBrkdwn",
    "calYrPrfrmncBrkdwn"
})
public class Yield1 {

    @XmlElement(name = "CmltvRtrsBrkdwn", required = true)
    protected List<RangeBreakdown1> cmltvRtrsBrkdwn;
    @XmlElement(name = "StdPrtflVoltlyBrkdwn", required = true)
    protected List<RangeBreakdown1> stdPrtflVoltlyBrkdwn;
    @XmlElement(name = "ShdwPrtflVoltlyBrkdwn")
    protected List<RangeBreakdown1> shdwPrtflVoltlyBrkdwn;
    @XmlElement(name = "CalYrPrfrmncBrkdwn")
    protected List<RangeBreakdown1> calYrPrfrmncBrkdwn;

    /**
     * Gets the value of the cmltvRtrsBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmltvRtrsBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmltvRtrsBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangeBreakdown1 }
     * 
     * 
     * @return
     *     The value of the cmltvRtrsBrkdwn property.
     */
    public List<RangeBreakdown1> getCmltvRtrsBrkdwn() {
        if (cmltvRtrsBrkdwn == null) {
            cmltvRtrsBrkdwn = new ArrayList<>();
        }
        return this.cmltvRtrsBrkdwn;
    }

    /**
     * Gets the value of the stdPrtflVoltlyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stdPrtflVoltlyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStdPrtflVoltlyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangeBreakdown1 }
     * 
     * 
     * @return
     *     The value of the stdPrtflVoltlyBrkdwn property.
     */
    public List<RangeBreakdown1> getStdPrtflVoltlyBrkdwn() {
        if (stdPrtflVoltlyBrkdwn == null) {
            stdPrtflVoltlyBrkdwn = new ArrayList<>();
        }
        return this.stdPrtflVoltlyBrkdwn;
    }

    /**
     * Gets the value of the shdwPrtflVoltlyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the shdwPrtflVoltlyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShdwPrtflVoltlyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangeBreakdown1 }
     * 
     * 
     * @return
     *     The value of the shdwPrtflVoltlyBrkdwn property.
     */
    public List<RangeBreakdown1> getShdwPrtflVoltlyBrkdwn() {
        if (shdwPrtflVoltlyBrkdwn == null) {
            shdwPrtflVoltlyBrkdwn = new ArrayList<>();
        }
        return this.shdwPrtflVoltlyBrkdwn;
    }

    /**
     * Gets the value of the calYrPrfrmncBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the calYrPrfrmncBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalYrPrfrmncBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangeBreakdown1 }
     * 
     * 
     * @return
     *     The value of the calYrPrfrmncBrkdwn property.
     */
    public List<RangeBreakdown1> getCalYrPrfrmncBrkdwn() {
        if (calYrPrfrmncBrkdwn == null) {
            calYrPrfrmncBrkdwn = new ArrayList<>();
        }
        return this.calYrPrfrmncBrkdwn;
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
     * Adds a new item to the cmltvRtrsBrkdwn list.
     * @see #getCmltvRtrsBrkdwn()
     * 
     */
    public Yield1 addCmltvRtrsBrkdwn(RangeBreakdown1 cmltvRtrsBrkdwn) {
        getCmltvRtrsBrkdwn().add(cmltvRtrsBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the stdPrtflVoltlyBrkdwn list.
     * @see #getStdPrtflVoltlyBrkdwn()
     * 
     */
    public Yield1 addStdPrtflVoltlyBrkdwn(RangeBreakdown1 stdPrtflVoltlyBrkdwn) {
        getStdPrtflVoltlyBrkdwn().add(stdPrtflVoltlyBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the shdwPrtflVoltlyBrkdwn list.
     * @see #getShdwPrtflVoltlyBrkdwn()
     * 
     */
    public Yield1 addShdwPrtflVoltlyBrkdwn(RangeBreakdown1 shdwPrtflVoltlyBrkdwn) {
        getShdwPrtflVoltlyBrkdwn().add(shdwPrtflVoltlyBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the calYrPrfrmncBrkdwn list.
     * @see #getCalYrPrfrmncBrkdwn()
     * 
     */
    public Yield1 addCalYrPrfrmncBrkdwn(RangeBreakdown1 calYrPrfrmncBrkdwn) {
        getCalYrPrfrmncBrkdwn().add(calYrPrfrmncBrkdwn);
        return this;
    }

}
