
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details of each package of currency control records.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyControlPackageStatus3", propOrder = {
    "packgId",
    "sts",
    "stsRsn",
    "stsDtTm",
    "rcrdSts"
})
public class CurrencyControlPackageStatus3 {

    @XmlElement(name = "PackgId", required = true)
    protected String packgId;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected StatisticalReportingStatus1Code sts;
    @XmlElement(name = "StsRsn")
    protected List<ValidationStatusReason3> stsRsn;
    @XmlElement(name = "StsDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stsDtTm;
    @XmlElement(name = "RcrdSts")
    protected List<CurrencyControlRecordStatus3> rcrdSts;

    /**
     * Gets the value of the packgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackgId() {
        return packgId;
    }

    /**
     * Sets the value of the packgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyControlPackageStatus3 setPackgId(String value) {
        this.packgId = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticalReportingStatus1Code }
     *     
     */
    public StatisticalReportingStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticalReportingStatus1Code }
     *     
     */
    public CurrencyControlPackageStatus3 setSts(StatisticalReportingStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationStatusReason3 }
     * 
     * 
     */
    public List<ValidationStatusReason3> getStsRsn() {
        if (stsRsn == null) {
            stsRsn = new ArrayList<ValidationStatusReason3>();
        }
        return this.stsRsn;
    }

    /**
     * Gets the value of the stsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getStsDtTm() {
        return stsDtTm;
    }

    /**
     * Sets the value of the stsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyControlPackageStatus3 setStsDtTm(XMLGregorianCalendar value) {
        this.stsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the rcrdSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcrdSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrdSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyControlRecordStatus3 }
     * 
     * 
     */
    public List<CurrencyControlRecordStatus3> getRcrdSts() {
        if (rcrdSts == null) {
            rcrdSts = new ArrayList<CurrencyControlRecordStatus3>();
        }
        return this.rcrdSts;
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
     * Adds a new item to the stsRsn list.
     * @see #getStsRsn()
     * 
     */
    public CurrencyControlPackageStatus3 addStsRsn(ValidationStatusReason3 stsRsn) {
        getStsRsn().add(stsRsn);
        return this;
    }

    /**
     * Adds a new item to the rcrdSts list.
     * @see #getRcrdSts()
     * 
     */
    public CurrencyControlPackageStatus3 addRcrdSts(CurrencyControlRecordStatus3 rcrdSts) {
        getRcrdSts().add(rcrdSts);
        return this;
    }

}
