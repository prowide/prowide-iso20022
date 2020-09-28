
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sese00400101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.004.001.01")
public class MxSese00400101
    extends AbstractMX
{

    @XmlElement(name = "sese.004.001.01", required = true)
    protected Sese00400101 sese00400101;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account1 .class, AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference2 .class, AlternateSecurityIdentification1 .class, Charge4 .class, ChargeBearer1Code.class, ChargeType4Code.class, ChargeTypeFormat2Choice.class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, DeliveryParameters2 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument3 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, IncomePreference1Code.class, Intermediary1 .class, InvestmentAccount10 .class, InvestmentAccount11 .class, LongPostalAddress1Choice.class, MxSese00400101 .class, NameAndAddress1 .class, NameAndAddress2 .class, PartyIdentification1Choice.class, PartyIdentificationAndAccount2 .class, PriceMethod1Code.class, PriceValue1 .class, ReceiveInformation2 .class, ReceivingPartiesAndAccount1 .class, SecurityIdentification1Choice.class, Sese00400101 .class, SimpleIdentificationInformation.class, StructuredLongPostalAddress1 .class, Tax3 .class, TaxExemptionReasonFormatChoice.class, TaxType2Code.class, TaxTypeFormat2Choice.class, TaxationBasis2Code.class, Transfer2 .class, TransferOut1 .class, TypeOfPrice2Code.class, UKTaxGroupUnitCode.class, Unit1 .class, UnitPrice3 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.004.001.01";

    public MxSese00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00400101(final String xml) {
        this();
        MxSese00400101 tmp = parse(xml);
        sese00400101 = tmp.getSese00400101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sese00400101 property.
     * 
     * @return
     *     possible object is
     *     {@link Sese00400101 }
     *     
     */
    public Sese00400101 getSese00400101() {
        return sese00400101;
    }

    /**
     * Sets the value of the sese00400101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sese00400101 }
     *     
     */
    public MxSese00400101 setSese00400101(Sese00400101 value) {
        this.sese00400101 = value;
        return this;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSese00400101 parse(String xml) {
        return ((MxSese00400101) MxReadImpl.parse(MxSese00400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00400101 parse(String xml, MxRead parserImpl) {
        return ((MxSese00400101) parserImpl.read(MxSese00400101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSese00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00400101 message
     * @return
     *     a new instance of MxSese00400101
     */
    public final static MxSese00400101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese00400101 .class);
    }

}
