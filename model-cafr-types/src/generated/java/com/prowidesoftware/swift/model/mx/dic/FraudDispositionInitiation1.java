
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
 * Information related to the  fraud disposition initiation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudDispositionInitiation1", propOrder = {
    "envt",
    "cntxt",
    "tx",
    "frdDspstnSts",
    "splmtryData"
})
public class FraudDispositionInitiation1 {

    @XmlElement(name = "Envt", required = true)
    protected Environment10 envt;
    @XmlElement(name = "Cntxt")
    protected Context8 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected Transaction80 tx;
    @XmlElement(name = "FrdDspstnSts", required = true)
    protected FraudDispositionStatus1 frdDspstnSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link Environment10 }
     *     
     */
    public Environment10 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Environment10 }
     *     
     */
    public FraudDispositionInitiation1 setEnvt(Environment10 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Context8 }
     *     
     */
    public Context8 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context8 }
     *     
     */
    public FraudDispositionInitiation1 setCntxt(Context8 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction80 }
     *     
     */
    public Transaction80 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction80 }
     *     
     */
    public FraudDispositionInitiation1 setTx(Transaction80 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the frdDspstnSts property.
     * 
     * @return
     *     possible object is
     *     {@link FraudDispositionStatus1 }
     *     
     */
    public FraudDispositionStatus1 getFrdDspstnSts() {
        return frdDspstnSts;
    }

    /**
     * Sets the value of the frdDspstnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudDispositionStatus1 }
     *     
     */
    public FraudDispositionInitiation1 setFrdDspstnSts(FraudDispositionStatus1 value) {
        this.frdDspstnSts = value;
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
    public FraudDispositionInitiation1 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
