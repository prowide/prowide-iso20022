
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.002.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collValRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.002.001.02")
public class MxColr00200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CollValRpt", required = true)
    protected CollateralValueReportV02 collValRpt;
    public static final transient String BUSINESS_PROCESS = "colr";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AddressType3Choice.class, AmountPricePerFinancialInstrumentQuantity9 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CollateralValuePosition3 .class, CollateralValueReport4 .class, CollateralValueReportOrError6Choice.class, CollateralValueReportOrError7Choice.class, CollateralValueReportV02 .class, ErrorHandling3Choice.class, ErrorHandling5 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, FinancialInstrumentQuantity1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification15 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, MessageHeader3 .class, MxColr00200102 .class, NameAndAddress5 .class, OriginalBusinessQuery1 .class, OtherIdentification1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, PostalAddress27 .class, PriceRateOrAmount3Choice.class, PriceValueType1Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, QuantityAndAvailability1 .class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, SecuritiesAccount19 .class, SecuritiesPosition1 .class, SecurityCharacteristics3 .class, SecurityIdentification19 .class, SubBalanceQuantity2Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification11 .class, SystemPartyIdentification8 .class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.002.001.02";

    public MxColr00200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00200102(final String xml) {
        this();
        MxColr00200102 tmp = parse(xml);
        collValRpt = tmp.getCollValRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collValRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralValueReportV02 }
     *     
     */
    public CollateralValueReportV02 getCollValRpt() {
        return collValRpt;
    }

    /**
     * Sets the value of the collValRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralValueReportV02 }
     *     
     */
    public MxColr00200102 setCollValRpt(CollateralValueReportV02 value) {
        this.collValRpt = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxColr00200102 parse(String xml) {
        return ((MxColr00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr00200102 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00200102 parse(String xml, MxRead parserImpl) {
        return ((MxColr00200102) parserImpl.read(MxColr00200102 .class, xml, _classes));
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
     * Creates an MxColr00200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00200102 message
     * @return
     *     a new instance of MxColr00200102
     */
    public static final MxColr00200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr00200102 .class);
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

}
