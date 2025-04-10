
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
 * Class for seev.052.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mktClmStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.052.001.02")
public class MxSeev05200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MktClmStsAdvc", required = true)
    protected MarketClaimStatusAdviceV02 mktClmStsAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 52;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptedReason10Choice.class, AcceptedStatus8Choice.class, AcceptedStatusReason9 .class, AccountIdentification46 .class, AcknowledgementReason7Code.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, CancelledReason8Choice.class, CancelledStatus12Choice.class, CancelledStatusReason11 .class, CancelledStatusReason6Code.class, CashAccountIdentification5Choice.class, CashOption91 .class, CorporateActionEventType29Code.class, CorporateActionEventType85Choice.class, CorporateActionGeneralInformation157 .class, CorporateActionOption11Code.class, CorporateActionOption217 .class, CorporateActionOption30Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateFormat43Choice.class, DateFormat58Choice.class, DateType1Code.class, DateType8Code.class, DocumentIdentification9 .class, FinancialInstrumentQuantity1Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, MarketClaimProcessingStatus1Choice.class, MarketClaimStatusAdviceV02 .class, MatchingStatus34Choice.class, MxSeev05200102 .class, NoReasonCode.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification127Choice.class, PendingReason22Code.class, PendingReason59Choice.class, PendingStatus63Choice.class, PendingStatusReason22 .class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity6Choice.class, RateAndAmountFormat40Choice.class, RateType42Choice.class, RateTypeAndPercentageRate8 .class, References26 .class, RejectedReason37Choice.class, RejectedStatus37Choice.class, RejectedStatusReason35 .class, RejectionReason59Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesOption76 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnmatchedReason16Code.class, UnmatchedReason22 .class, UnmatchedReason31Choice.class, UnmatchedStatus23Choice.class, WithholdingTaxRateType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.052.001.02";

    public MxSeev05200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev05200102(final String xml) {
        this();
        MxSeev05200102 tmp = parse(xml);
        mktClmStsAdvc = tmp.getMktClmStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev05200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mktClmStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClaimStatusAdviceV02 }
     *     
     */
    public MarketClaimStatusAdviceV02 getMktClmStsAdvc() {
        return mktClmStsAdvc;
    }

    /**
     * Sets the value of the mktClmStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClaimStatusAdviceV02 }
     *     
     */
    public MxSeev05200102 setMktClmStsAdvc(MarketClaimStatusAdviceV02 value) {
        this.mktClmStsAdvc = value;
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
    public static MxSeev05200102 parse(String xml) {
        return ((MxSeev05200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev05200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev05200102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev05200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev05200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev05200102 parse(String xml, MxRead parserImpl) {
        return ((MxSeev05200102) parserImpl.read(MxSeev05200102 .class, xml, _classes));
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
     * Creates an MxSeev05200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev05200102 message
     * @return
     *     a new instance of MxSeev05200102
     */
    public static final MxSeev05200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev05200102 .class);
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
