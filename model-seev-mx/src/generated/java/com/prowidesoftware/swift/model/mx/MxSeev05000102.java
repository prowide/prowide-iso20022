
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.050.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mktClmCre"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.050.001.02")
public class MxSeev05000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MktClmCre", required = true)
    protected MarketClaimCreationV02 mktClmCre;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 50;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification46 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification7 .class, CashAccountIdentification5Choice.class, CashOption91 .class, CorporateAction59 .class, CorporateActionEventType29Code.class, CorporateActionEventType85Choice.class, CorporateActionGeneralInformation157 .class, CorporateActionOption11Code.class, CorporateActionOption217 .class, CorporateActionOption30Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateFormat43Choice.class, DateFormat58Choice.class, DateType1Code.class, DateType8Code.class, FinancialInstrumentQuantity18Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, MarketClaimCreationV02 .class, MarketClaimType1Code.class, MxSeev05000102 .class, NameAndAddress5 .class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification127Choice.class, PartyIdentification143 .class, PartyIdentificationAndAccount163 .class, PostalAddress1 .class, Quantity6Choice.class, RateAndAmountFormat40Choice.class, RateType42Choice.class, RateTypeAndPercentageRate8 .class, References25 .class, RelatedSettlementInstruction1 .class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesOption76 .class, SecurityIdentification19 .class, SettlementParties122 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification1Code.class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.050.001.02";

    public MxSeev05000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev05000102(final String xml) {
        this();
        MxSeev05000102 tmp = parse(xml);
        mktClmCre = tmp.getMktClmCre();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev05000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mktClmCre property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClaimCreationV02 }
     *     
     */
    public MarketClaimCreationV02 getMktClmCre() {
        return mktClmCre;
    }

    /**
     * Sets the value of the mktClmCre property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClaimCreationV02 }
     *     
     */
    public MxSeev05000102 setMktClmCre(MarketClaimCreationV02 value) {
        this.mktClmCre = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSeev05000102 parse(String xml) {
        return ((MxSeev05000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev05000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev05000102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev05000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev05000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev05000102 parse(String xml, MxRead parserImpl) {
        return ((MxSeev05000102) parserImpl.read(MxSeev05000102 .class, xml, _classes));
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
     * Creates an MxSeev05000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev05000102 message
     * @return
     *     a new instance of MxSeev05000102
     */
    public final static MxSeev05000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev05000102 .class);
    }

}
