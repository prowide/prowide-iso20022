
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.006.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfInCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.006.001.04")
public class MxSese00600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfInCxlReq", required = true)
    protected TransferInCancellationRequestV04 trfInCxlReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference2 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BICIdentification1 .class, BeneficiaryCertificationCompletion1Code.class, Cancellation2Choice.class, Charge20 .class, ChargeBearer1Code.class, ChargeType12Code.class, Commission12 .class, CommissionType7Code.class, ContactIdentification2 .class, CopyInformation2 .class, DateAndDateTimeChoice.class, DateFormat1Choice.class, DeliverInformation9 .class, DeliveringPartiesAndAccount8 .class, DeliveryParameters4 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument13 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, HoldingsPlanType1Code.class, IncomePreference1Code.class, Intermediary10 .class, Intermediary11 .class, InvestmentAccount22 .class, InvestmentAccount24 .class, InvestmentFundRole2Code.class, LongPostalAddress1Choice.class, MessageIdentification1 .class, MxSese00600104 .class, NameAndAddress2 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, PartyIdentification1Choice.class, PartyIdentification21 .class, PartyIdentification2Choice.class, PartyIdentificationAndAccount4 .class, PartyIdentificationAndAccount5 .class, PartyIdentificationAndAccount93 .class, PhysicalTransferType1Code.class, PostalAddress1 .class, References11 .class, SecurityIdentification3Choice.class, SettlementDate1Code.class, SimpleIdentificationInformation.class, StampDutyType2Code.class, StructuredLongPostalAddress1 .class, SubAccount1 .class, Tax15 .class, TaxType13Code.class, TaxationBasis2Code.class, TaxationBasis4Code.class, Transfer22 .class, TransferIn7 .class, TransferInCancellationRequestV04 .class, TransferReference1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.006.001.04";

    public MxSese00600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00600104(final String xml) {
        this();
        MxSese00600104 tmp = parse(xml);
        trfInCxlReq = tmp.getTrfInCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfInCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInCancellationRequestV04 }
     *     
     */
    public TransferInCancellationRequestV04 getTrfInCxlReq() {
        return trfInCxlReq;
    }

    /**
     * Sets the value of the trfInCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInCancellationRequestV04 }
     *     
     */
    public MxSese00600104 setTrfInCxlReq(TransferInCancellationRequestV04 value) {
        this.trfInCxlReq = value;
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
    public static MxSese00600104 parse(String xml) {
        return ((MxSese00600104) MxReadImpl.parse(MxSese00600104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00600104 parse(String xml, MxRead parserImpl) {
        return ((MxSese00600104) parserImpl.read(MxSese00600104 .class, xml, _classes));
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
     * Creates an MxSese00600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00600104 message
     * @return
     *     a new instance of MxSese00600104
     */
    public final static MxSese00600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00600104 .class);
    }

}
