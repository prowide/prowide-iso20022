
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
 * The MultipleForeignExchangeSD1V01 message extends ISO 20022 Customer Credit Transfer Initiation (pain.001) message for a single debit account with multiple foreign exchange contracts. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleForeignExchangeSD1V01", propOrder = {
    "fxSplmtryData"
})
public class MultipleForeignExchangeSD1V01 {

    @XmlElement(name = "FXSplmtryData", required = true)
    protected List<FXSupplementaryData1> fxSplmtryData;

    /**
     * Gets the value of the fxSplmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fxSplmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FXSupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the fxSplmtryData property.
     */
    public List<FXSupplementaryData1> getFXSplmtryData() {
        if (fxSplmtryData == null) {
            fxSplmtryData = new ArrayList<>();
        }
        return this.fxSplmtryData;
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
     * Adds a new item to the fXSplmtryData list.
     * @see #getFXSplmtryData()
     * 
     */
    public MultipleForeignExchangeSD1V01 addFXSplmtryData(FXSupplementaryData1 fXSplmtryData) {
        getFXSplmtryData().add(fXSplmtryData);
        return this;
    }

}
