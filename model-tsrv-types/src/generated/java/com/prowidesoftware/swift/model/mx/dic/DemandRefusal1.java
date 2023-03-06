
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
 * Information about the refusal of a demand.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandRefusal1", propOrder = {
    "udrtkgId",
    "advsgPtyRefNb",
    "scndAdvsgPtyRefNb",
    "cnfrmrRefNb",
    "dmndDtls",
    "sts",
    "dscrpncy",
    "dspstnOfDocs",
    "addtlInf"
})
public class DemandRefusal1 {

    @XmlElement(name = "UdrtkgId", required = true)
    protected Undertaking9 udrtkgId;
    @XmlElement(name = "AdvsgPtyRefNb")
    protected String advsgPtyRefNb;
    @XmlElement(name = "ScndAdvsgPtyRefNb")
    protected String scndAdvsgPtyRefNb;
    @XmlElement(name = "CnfrmrRefNb")
    protected String cnfrmrRefNb;
    @XmlElement(name = "DmndDtls", required = true)
    protected Demand2 dmndDtls;
    @XmlElement(name = "Sts", required = true)
    protected String sts;
    @XmlElement(name = "Dscrpncy")
    protected List<Discrepancy1> dscrpncy;
    @XmlElement(name = "DspstnOfDocs")
    protected List<String> dspstnOfDocs;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking9 }
     *     
     */
    public Undertaking9 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking9 }
     *     
     */
    public DemandRefusal1 setUdrtkgId(Undertaking9 value) {
        this.udrtkgId = value;
        return this;
    }

    /**
     * Gets the value of the advsgPtyRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvsgPtyRefNb() {
        return advsgPtyRefNb;
    }

    /**
     * Sets the value of the advsgPtyRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DemandRefusal1 setAdvsgPtyRefNb(String value) {
        this.advsgPtyRefNb = value;
        return this;
    }

    /**
     * Gets the value of the scndAdvsgPtyRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndAdvsgPtyRefNb() {
        return scndAdvsgPtyRefNb;
    }

    /**
     * Sets the value of the scndAdvsgPtyRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DemandRefusal1 setScndAdvsgPtyRefNb(String value) {
        this.scndAdvsgPtyRefNb = value;
        return this;
    }

    /**
     * Gets the value of the cnfrmrRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfrmrRefNb() {
        return cnfrmrRefNb;
    }

    /**
     * Sets the value of the cnfrmrRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DemandRefusal1 setCnfrmrRefNb(String value) {
        this.cnfrmrRefNb = value;
        return this;
    }

    /**
     * Gets the value of the dmndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Demand2 }
     *     
     */
    public Demand2 getDmndDtls() {
        return dmndDtls;
    }

    /**
     * Sets the value of the dmndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demand2 }
     *     
     */
    public DemandRefusal1 setDmndDtls(Demand2 value) {
        this.dmndDtls = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DemandRefusal1 setSts(String value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the dscrpncy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dscrpncy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDscrpncy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discrepancy1 }
     * 
     * 
     */
    public List<Discrepancy1> getDscrpncy() {
        if (dscrpncy == null) {
            dscrpncy = new ArrayList<Discrepancy1>();
        }
        return this.dscrpncy;
    }

    /**
     * Gets the value of the dspstnOfDocs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dspstnOfDocs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDspstnOfDocs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDspstnOfDocs() {
        if (dspstnOfDocs == null) {
            dspstnOfDocs = new ArrayList<String>();
        }
        return this.dspstnOfDocs;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
        }
        return this.addtlInf;
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
     * Adds a new item to the dscrpncy list.
     * @see #getDscrpncy()
     * 
     */
    public DemandRefusal1 addDscrpncy(Discrepancy1 dscrpncy) {
        getDscrpncy().add(dscrpncy);
        return this;
    }

    /**
     * Adds a new item to the dspstnOfDocs list.
     * @see #getDspstnOfDocs()
     * 
     */
    public DemandRefusal1 addDspstnOfDocs(String dspstnOfDocs) {
        getDspstnOfDocs().add(dspstnOfDocs);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public DemandRefusal1 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
