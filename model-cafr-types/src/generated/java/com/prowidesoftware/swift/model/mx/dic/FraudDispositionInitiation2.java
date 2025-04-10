
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
 * Information related to the  fraud disposition initiation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudDispositionInitiation2", propOrder = {
    "envt",
    "cntxt",
    "tx",
    "frdDspstnSts",
    "splmtryData"
})
public class FraudDispositionInitiation2 {

    @XmlElement(name = "Envt", required = true)
    protected Environment28 envt;
    @XmlElement(name = "Cntxt")
    protected Context17 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected Transaction128 tx;
    @XmlElement(name = "FrdDspstnSts", required = true)
    protected FraudDispositionStatus2 frdDspstnSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link Environment28 }
     *     
     */
    public Environment28 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Environment28 }
     *     
     */
    public FraudDispositionInitiation2 setEnvt(Environment28 value) {
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
    public FraudDispositionInitiation2 setCntxt(Context17 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction128 }
     *     
     */
    public Transaction128 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction128 }
     *     
     */
    public FraudDispositionInitiation2 setTx(Transaction128 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the frdDspstnSts property.
     * 
     * @return
     *     possible object is
     *     {@link FraudDispositionStatus2 }
     *     
     */
    public FraudDispositionStatus2 getFrdDspstnSts() {
        return frdDspstnSts;
    }

    /**
     * Sets the value of the frdDspstnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudDispositionStatus2 }
     *     
     */
    public FraudDispositionInitiation2 setFrdDspstnSts(FraudDispositionStatus2 value) {
        this.frdDspstnSts = value;
        return this;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public FraudDispositionInitiation2 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
