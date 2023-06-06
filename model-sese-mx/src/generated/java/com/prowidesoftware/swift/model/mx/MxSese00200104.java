
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
 * Class for sese.002.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfOutCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.002.001.04")
public class MxSese00200104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfOutCxlReq", required = true)
    protected TransferOutCancellationRequestV04 trfOutCxlReq;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference2 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BICIdentification1 .class, BeneficiaryCertificationCompletion1Code.class, Cancellation1Choice.class, Charge20 .class, ChargeBearer1Code.class, ChargeType12Code.class, Commission12 .class, CommissionType7Code.class, ContactIdentification2 .class, CopyInformation2 .class, DateAndDateTimeChoice.class, DateFormat1Choice.class, DeliveryParameters4 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument13 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, HoldingsPlanType1Code.class, IncomePreference1Code.class, Intermediary10 .class, Intermediary11 .class, InvestmentAccount22 .class, InvestmentAccount24 .class, InvestmentFundRole2Code.class, LongPostalAddress1Choice.class, MessageIdentification1 .class, MxSese00200104 .class, NameAndAddress2 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, PartyIdentification1Choice.class, PartyIdentification21 .class, PartyIdentification2Choice.class, PartyIdentificationAndAccount4 .class, PartyIdentificationAndAccount5 .class, PartyIdentificationAndAccount93 .class, PhysicalTransferType1Code.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, Quantity13Choice.class, ReceiveInformation9 .class, ReceivingPartiesAndAccount8 .class, References11 .class, RoundingDirection2Code.class, SecurityIdentification3Choice.class, SettlementDate1Code.class, SimpleIdentificationInformation.class, StampDutyType2Code.class, StructuredLongPostalAddress1 .class, SubAccount1 .class, Tax15 .class, TaxType13Code.class, TaxationBasis2Code.class, TaxationBasis4Code.class, Transfer20 .class, TransferOut9 .class, TransferOutCancellationRequestV04 .class, TransferReference1 .class, TypeOfPrice12Code.class, UKTaxGroupUnitCode.class, Unit3 .class, UnitPrice12 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.002.001.04";

    public MxSese00200104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00200104(final String xml) {
        this();
        MxSese00200104 tmp = parse(xml);
        trfOutCxlReq = tmp.getTrfOutCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00200104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfOutCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link TransferOutCancellationRequestV04 }
     *     
     */
    public TransferOutCancellationRequestV04 getTrfOutCxlReq() {
        return trfOutCxlReq;
    }

    /**
     * Sets the value of the trfOutCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferOutCancellationRequestV04 }
     *     
     */
    public MxSese00200104 setTrfOutCxlReq(TransferOutCancellationRequestV04 value) {
        this.trfOutCxlReq = value;
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
    public static MxSese00200104 parse(String xml) {
        return ((MxSese00200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese00200104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese00200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00200104 parse(String xml, MxRead parserImpl) {
        return ((MxSese00200104) parserImpl.read(MxSese00200104 .class, xml, _classes));
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
     * Creates an MxSese00200104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00200104 message
     * @return
     *     a new instance of MxSese00200104
     */
    public static final MxSese00200104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00200104 .class);
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
