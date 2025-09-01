
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
 * Addendum message is used in conjunction with an authorisation or financial message to provide supplemental data above that required to complete an authorisation initiation or financial initiation. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddendumInitiation2", propOrder = {
    "envt",
    "cntxt",
    "tx",
    "adddmData",
    "prtctdData",
    "splmtryData"
})
public class AddendumInitiation2 {

    @XmlElement(name = "Envt", required = true)
    protected Environment30 envt;
    @XmlElement(name = "Cntxt")
    protected Context17 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected Transaction148 tx;
    @XmlElement(name = "AdddmData", required = true)
    protected AddendumData3 adddmData;
    @XmlElement(name = "PrtctdData")
    protected List<ProtectedData1> prtctdData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link Environment30 }
     *     
     */
    public Environment30 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Environment30 }
     *     
     */
    public AddendumInitiation2 setEnvt(Environment30 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Context17 }
     *     
     */
    public Context17 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context17 }
     *     
     */
    public AddendumInitiation2 setCntxt(Context17 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction148 }
     *     
     */
    public Transaction148 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction148 }
     *     
     */
    public AddendumInitiation2 setTx(Transaction148 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the adddmData property.
     * 
     * @return
     *     possible object is
     *     {@link AddendumData3 }
     *     
     */
    public AddendumData3 getAdddmData() {
        return adddmData;
    }

    /**
     * Sets the value of the adddmData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddendumData3 }
     *     
     */
    public AddendumInitiation2 setAdddmData(AddendumData3 value) {
        this.adddmData = value;
        return this;
    }

    /**
     * Gets the value of the prtctdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtctdData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtctdData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtectedData1 }
     * 
     * 
     */
    public List<ProtectedData1> getPrtctdData() {
        if (prtctdData == null) {
            prtctdData = new ArrayList<ProtectedData1>();
        }
        return this.prtctdData;
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
     * Adds a new item to the prtctdData list.
     * @see #getPrtctdData()
     * 
     */
    public AddendumInitiation2 addPrtctdData(ProtectedData1 prtctdData) {
        getPrtctdData().add(prtctdData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AddendumInitiation2 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
