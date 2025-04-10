
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
 * Class for seev.053.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mktClmCxlReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.053.001.01")
public class MxSeev05300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MktClmCxlReqStsAdvc", required = true)
    protected MarketClaimCancellationRequestStatusAdviceV01 mktClmCxlReqStsAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 53;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, CancelledReason9Choice.class, CancelledStatus11Choice.class, CancelledStatusReason12 .class, CancelledStatusReason5Code.class, CashAccountIdentification5Choice.class, CashOption76 .class, CorporateActionEventType29Code.class, CorporateActionEventType85Choice.class, CorporateActionGeneralInformation157 .class, CorporateActionOption11Code.class, CorporateActionOption185 .class, CorporateActionOption30Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateFormat43Choice.class, DateFormat58Choice.class, DateType1Code.class, DateType8Code.class, DocumentIdentification9 .class, FinancialInstrumentQuantity1Choice.class, GenericIdentification30 .class, IdentificationSource3Choice.class, MarketClaimCancellationRequestStatus1Choice.class, MarketClaimCancellationRequestStatusAdviceV01 .class, MxSeev05300101 .class, NoReasonCode.class, NoSpecifiedReason1 .class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PendingCancellationReason7Code.class, PendingCancellationReason8Choice.class, PendingCancellationStatus11Choice.class, PendingCancellationStatusReason11 .class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity6Choice.class, RateAndAmountFormat40Choice.class, RateType42Choice.class, RateTypeAndPercentageRate8 .class, References26 .class, RejectedReason38Choice.class, RejectedStatus38Choice.class, RejectedStatusReason36 .class, RejectionReason61Code.class, SecuritiesOption76 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, WithholdingTaxRateType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.053.001.01";

    public MxSeev05300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev05300101(final String xml) {
        this();
        MxSeev05300101 tmp = parse(xml);
        mktClmCxlReqStsAdvc = tmp.getMktClmCxlReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev05300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mktClmCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClaimCancellationRequestStatusAdviceV01 }
     *     
     */
    public MarketClaimCancellationRequestStatusAdviceV01 getMktClmCxlReqStsAdvc() {
        return mktClmCxlReqStsAdvc;
    }

    /**
     * Sets the value of the mktClmCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClaimCancellationRequestStatusAdviceV01 }
     *     
     */
    public MxSeev05300101 setMktClmCxlReqStsAdvc(MarketClaimCancellationRequestStatusAdviceV01 value) {
        this.mktClmCxlReqStsAdvc = value;
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
    public static MxSeev05300101 parse(String xml) {
        return ((MxSeev05300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev05300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev05300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev05300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev05300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev05300101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev05300101) parserImpl.read(MxSeev05300101 .class, xml, _classes));
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
     * Creates an MxSeev05300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev05300101 message
     * @return
     *     a new instance of MxSeev05300101
     */
    public static final MxSeev05300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev05300101 .class);
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
