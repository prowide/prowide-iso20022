
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
 * Specifies the attributes of the benchmark, which is / are being updated.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenchmarkUpdate1", propOrder = {
    "techRcrdId",
    "id",
    "prvsId",
    "othr",
    "admstr",
    "ndrsngPty",
    "sts",
    "techVldtyPrd",
    "splmtryData"
})
public class BenchmarkUpdate1 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification19 id;
    @XmlElement(name = "PrvsId")
    protected SecurityIdentification19 prvsId;
    @XmlElement(name = "Othr", required = true)
    protected BenchmarkDetail1 othr;
    @XmlElement(name = "Admstr", required = true)
    protected PartyIdentification136 admstr;
    @XmlElement(name = "NdrsngPty")
    protected PartyIdentification136 ndrsngPty;
    @XmlElement(name = "Sts")
    protected StatusDetail1 sts;
    @XmlElement(name = "TechVldtyPrd")
    protected Period4Choice techVldtyPrd;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BenchmarkUpdate1 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public BenchmarkUpdate1 setId(SecurityIdentification19 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the prvsId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getPrvsId() {
        return prvsId;
    }

    /**
     * Sets the value of the prvsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public BenchmarkUpdate1 setPrvsId(SecurityIdentification19 value) {
        this.prvsId = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkDetail1 }
     *     
     */
    public BenchmarkDetail1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkDetail1 }
     *     
     */
    public BenchmarkUpdate1 setOthr(BenchmarkDetail1 value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the admstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getAdmstr() {
        return admstr;
    }

    /**
     * Sets the value of the admstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public BenchmarkUpdate1 setAdmstr(PartyIdentification136 value) {
        this.admstr = value;
        return this;
    }

    /**
     * Gets the value of the ndrsngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getNdrsngPty() {
        return ndrsngPty;
    }

    /**
     * Sets the value of the ndrsngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public BenchmarkUpdate1 setNdrsngPty(PartyIdentification136 value) {
        this.ndrsngPty = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetail1 }
     *     
     */
    public StatusDetail1 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetail1 }
     *     
     */
    public BenchmarkUpdate1 setSts(StatusDetail1 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the techVldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getTechVldtyPrd() {
        return techVldtyPrd;
    }

    /**
     * Sets the value of the techVldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public BenchmarkUpdate1 setTechVldtyPrd(Period4Choice value) {
        this.techVldtyPrd = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public BenchmarkUpdate1 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
