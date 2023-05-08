
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
 * Criterion by which the cash movements are broken down.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashSortingCriterion2", propOrder = {
    "srtgCritnTp",
    "fcstBrkdwnDtls"
})
public class CashSortingCriterion2 {

    @XmlElement(name = "SrtgCritnTp", required = true)
    protected SortCriteria1Choice srtgCritnTp;
    @XmlElement(name = "FcstBrkdwnDtls", required = true)
    protected List<ForecastParameter2> fcstBrkdwnDtls;

    /**
     * Gets the value of the srtgCritnTp property.
     * 
     * @return
     *     possible object is
     *     {@link SortCriteria1Choice }
     *     
     */
    public SortCriteria1Choice getSrtgCritnTp() {
        return srtgCritnTp;
    }

    /**
     * Sets the value of the srtgCritnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortCriteria1Choice }
     *     
     */
    public CashSortingCriterion2 setSrtgCritnTp(SortCriteria1Choice value) {
        this.srtgCritnTp = value;
        return this;
    }

    /**
     * Gets the value of the fcstBrkdwnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fcstBrkdwnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFcstBrkdwnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastParameter2 }
     * 
     * 
     * @return
     *     The value of the fcstBrkdwnDtls property.
     */
    public List<ForecastParameter2> getFcstBrkdwnDtls() {
        if (fcstBrkdwnDtls == null) {
            fcstBrkdwnDtls = new ArrayList<>();
        }
        return this.fcstBrkdwnDtls;
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
     * Adds a new item to the fcstBrkdwnDtls list.
     * @see #getFcstBrkdwnDtls()
     * 
     */
    public CashSortingCriterion2 addFcstBrkdwnDtls(ForecastParameter2 fcstBrkdwnDtls) {
        getFcstBrkdwnDtls().add(fcstBrkdwnDtls);
        return this;
    }

}
