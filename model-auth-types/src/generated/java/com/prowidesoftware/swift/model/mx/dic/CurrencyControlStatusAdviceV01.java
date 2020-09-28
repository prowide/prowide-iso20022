
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The CurrencyControlStatusAdvice message is sent by either the reporting party (respectively the registration agent or the registration agent (respectively the reporting party) to provide a status advice on a previously sent currency control message.
 * 
 * Usage: 
 * The message may be sent in response to requests on the registration of  the currency control contract, supporting document or on the payment regulatory information notification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyControlStatusAdviceV01", propOrder = {
    "grpHdr",
    "grpSts",
    "packgSts",
    "splmtryData"
})
public class CurrencyControlStatusAdviceV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected CurrencyControlHeader2 grpHdr;
    @XmlElement(name = "GrpSts", required = true)
    protected List<CurrencyControlGroupStatus1> grpSts;
    @XmlElement(name = "PackgSts")
    protected List<CurrencyControlPackageStatus1> packgSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyControlHeader2 }
     *     
     */
    public CurrencyControlHeader2 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyControlHeader2 }
     *     
     */
    public CurrencyControlStatusAdviceV01 setGrpHdr(CurrencyControlHeader2 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the grpSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grpSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrpSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyControlGroupStatus1 }
     * 
     * 
     */
    public List<CurrencyControlGroupStatus1> getGrpSts() {
        if (grpSts == null) {
            grpSts = new ArrayList<CurrencyControlGroupStatus1>();
        }
        return this.grpSts;
    }

    /**
     * Gets the value of the packgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyControlPackageStatus1 }
     * 
     * 
     */
    public List<CurrencyControlPackageStatus1> getPackgSts() {
        if (packgSts == null) {
            packgSts = new ArrayList<CurrencyControlPackageStatus1>();
        }
        return this.packgSts;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the grpSts list.
     * @see #getGrpSts()
     * 
     */
    public CurrencyControlStatusAdviceV01 addGrpSts(CurrencyControlGroupStatus1 grpSts) {
        getGrpSts().add(grpSts);
        return this;
    }

    /**
     * Adds a new item to the packgSts list.
     * @see #getPackgSts()
     * 
     */
    public CurrencyControlStatusAdviceV01 addPackgSts(CurrencyControlPackageStatus1 packgSts) {
        getPackgSts().add(packgSts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CurrencyControlStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
