
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
 * The DTCCCAINSD1 message extends ISO corporate action instruction message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAINSD1V01", propOrder = {
    "optnlDvdd",
    "taxXmpt",
    "wireInstr",
    "dtcTaxRlf",
    "usTaxWhldg",
    "cshInLieu"
})
public class DTCCCAINSD1V01 {

    @XmlElement(name = "OptnlDvdd")
    protected List<OptionalDividendAccountQuantitySD1> optnlDvdd;
    @XmlElement(name = "TaxXmpt")
    protected List<TaxExemptQuantitySD1> taxXmpt;
    @XmlElement(name = "WireInstr")
    protected List<WireInstructionSD1> wireInstr;
    @XmlElement(name = "DTCTaxRlf")
    protected List<DTCTaxReliefSD2> dtcTaxRlf;
    @XmlElement(name = "USTaxWhldg")
    protected List<USTaxWithholdingSD1> usTaxWhldg;
    @XmlElement(name = "CshInLieu")
    protected List<CashInLieuSD1> cshInLieu;

    /**
     * Gets the value of the optnlDvdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnlDvdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnlDvdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionalDividendAccountQuantitySD1 }
     * 
     * 
     * @return
     *     The value of the optnlDvdd property.
     */
    public List<OptionalDividendAccountQuantitySD1> getOptnlDvdd() {
        if (optnlDvdd == null) {
            optnlDvdd = new ArrayList<>();
        }
        return this.optnlDvdd;
    }

    /**
     * Gets the value of the taxXmpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxXmpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxXmpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxExemptQuantitySD1 }
     * 
     * 
     * @return
     *     The value of the taxXmpt property.
     */
    public List<TaxExemptQuantitySD1> getTaxXmpt() {
        if (taxXmpt == null) {
            taxXmpt = new ArrayList<>();
        }
        return this.taxXmpt;
    }

    /**
     * Gets the value of the wireInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wireInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWireInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireInstructionSD1 }
     * 
     * 
     * @return
     *     The value of the wireInstr property.
     */
    public List<WireInstructionSD1> getWireInstr() {
        if (wireInstr == null) {
            wireInstr = new ArrayList<>();
        }
        return this.wireInstr;
    }

    /**
     * Gets the value of the dtcTaxRlf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dtcTaxRlf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTCTaxRlf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTCTaxReliefSD2 }
     * 
     * 
     * @return
     *     The value of the dtcTaxRlf property.
     */
    public List<DTCTaxReliefSD2> getDTCTaxRlf() {
        if (dtcTaxRlf == null) {
            dtcTaxRlf = new ArrayList<>();
        }
        return this.dtcTaxRlf;
    }

    /**
     * Gets the value of the usTaxWhldg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the usTaxWhldg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUSTaxWhldg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link USTaxWithholdingSD1 }
     * 
     * 
     * @return
     *     The value of the usTaxWhldg property.
     */
    public List<USTaxWithholdingSD1> getUSTaxWhldg() {
        if (usTaxWhldg == null) {
            usTaxWhldg = new ArrayList<>();
        }
        return this.usTaxWhldg;
    }

    /**
     * Gets the value of the cshInLieu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshInLieu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshInLieu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashInLieuSD1 }
     * 
     * 
     * @return
     *     The value of the cshInLieu property.
     */
    public List<CashInLieuSD1> getCshInLieu() {
        if (cshInLieu == null) {
            cshInLieu = new ArrayList<>();
        }
        return this.cshInLieu;
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
     * Adds a new item to the optnlDvdd list.
     * @see #getOptnlDvdd()
     * 
     */
    public DTCCCAINSD1V01 addOptnlDvdd(OptionalDividendAccountQuantitySD1 optnlDvdd) {
        getOptnlDvdd().add(optnlDvdd);
        return this;
    }

    /**
     * Adds a new item to the taxXmpt list.
     * @see #getTaxXmpt()
     * 
     */
    public DTCCCAINSD1V01 addTaxXmpt(TaxExemptQuantitySD1 taxXmpt) {
        getTaxXmpt().add(taxXmpt);
        return this;
    }

    /**
     * Adds a new item to the wireInstr list.
     * @see #getWireInstr()
     * 
     */
    public DTCCCAINSD1V01 addWireInstr(WireInstructionSD1 wireInstr) {
        getWireInstr().add(wireInstr);
        return this;
    }

    /**
     * Adds a new item to the dTCTaxRlf list.
     * @see #getDTCTaxRlf()
     * 
     */
    public DTCCCAINSD1V01 addDTCTaxRlf(DTCTaxReliefSD2 dTCTaxRlf) {
        getDTCTaxRlf().add(dTCTaxRlf);
        return this;
    }

    /**
     * Adds a new item to the uSTaxWhldg list.
     * @see #getUSTaxWhldg()
     * 
     */
    public DTCCCAINSD1V01 addUSTaxWhldg(USTaxWithholdingSD1 uSTaxWhldg) {
        getUSTaxWhldg().add(uSTaxWhldg);
        return this;
    }

    /**
     * Adds a new item to the cshInLieu list.
     * @see #getCshInLieu()
     * 
     */
    public DTCCCAINSD1V01 addCshInLieu(CashInLieuSD1 cshInLieu) {
        getCshInLieu().add(cshInLieu);
        return this;
    }

}
